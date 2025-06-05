from datetime import datetime, timedelta
import requests
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

    closed_issues = requests.get(
        f"https://api.github.com/search/issues?q=repo:{repo}+is:issue+is:closed",
        headers=headers
    ).json().get("total_count", 0)

    forks = data.get("forks_count", 0)
    watchers = data.get("subscribers_count", 0)

    since = (datetime.utcnow() - timedelta(days=7)).isoformat() + "Z"
    commits_url = f"https://api.github.com/repos/{repo}/commits?since={since}"
    commits_data = requests.get(commits_url, headers=headers).json()
    commits_count = len(commits_data) if isinstance(commits_data, list) else 0

    msg = "*Cleaner Royall Repo Weekly Summary*\n\n"
    msg += f"\\- ⭐ Stars: {escape_md2(str(stars))}\n"
    msg += f"\\- 🍴 Forks: {escape_md2(str(forks))}\n"
    msg += f"\\- 👀 Watchers: {escape_md2(str(watchers))}\n"
    msg += f"\\- 🐞 Open issues: {escape_md2(str(open_issues))}\n"
    msg += f"\\- ✅ Closed issues: {escape_md2(str(closed_issues))}\n"
    msg += f"\\- 💾 Repo size: {escape_md2(str(size))} KB\n"
    msg += f"\\- Last 7 days commits: {escape_md2(str(commits_count))}"

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