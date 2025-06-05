import requests
import json
import os

def escape_md2(text):
    escape_chars = r'_*[]()~`>#+-=|{}.!'
    for c in escape_chars:
        text = text.replace(c, f'\\{c}')
    return text

def main():
    repo = os.getenv("REPO")
    token = os.getenv("GITHUB_TOKEN")
    tg_token = os.getenv("TELEGRAM_TOKEN")
    tg_chat_id = os.getenv("TELEGRAM_CHAT_ID")

    headers = {"Authorization": f"Bearer {token}"}
    repo_url = f"https://api.github.com/repos/{repo}"
    data = requests.get(repo_url, headers=headers).json()

    open_issues = data.get("open_issues_count", 0)
    stars = data.get("stargazers_count", 0)
    size = data.get("size", 0)
    language = data.get("language", "N/A")
    html_url = data.get("html_url", "")

    closed_issues = requests.get(
        f"https://api.github.com/search/issues?q=repo:{repo}+is:issue+is:closed",
        headers=headers
    ).json().get("total_count", 0)

    msg = "*Cleaner\\-Royall GitHub Repo Summary*\n"
    msg += f"`{escape_md2(repo)}`\\ \{escape_md2(html_url)}\\n\n"
    msg += f"\\- Stars: {escape_md2(str(stars))}\n"
    msg += f"\\- Codespace size: {escape_md2(str(size))} KB\n"
    msg += f"\\- Language: {escape_md2(language)}\n"
    msg += f"\\- Open issues: {escape_md2(str(open_issues))}\n"
    msg += f"\\- Closed issues: {escape_md2(str(closed_issues))}"

    res = requests.post(
        f"https://api.telegram.org/bot{tg_token}/sendMessage",
        data={
            "chat_id": tg_chat_id,
            "text": msg,
            "parse_mode": "MarkdownV2",
            "disable_web_page_preview": "true"
        }
    )

    print("Telegram response:", res.text)
    if not res.ok or '"ok":false' in res.text:
        raise Exception("Telegram API error detected.")

if __name__ == "__main__":
    main()