import requests
import json
import os
from datetime import datetime, timedelta

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
    size_kb = data.get("size", 0)
    size_mb = round(size_kb / 1024, 2)
    forks = data.get("forks_count", 0)
    watchers = data.get("subscribers_count", 0)

    closed_issues = requests.get(
        f"https://api.github.com/search/issues?q=repo:{repo}+is:issue+is:closed",
        headers=headers
    ).json().get("total_count", 0)

    # Get commits from last 7 days
    since = (datetime.utcnow() - timedelta(days=7)).isoformat() + 'Z'
    commits_url = f"https://api.github.com/repos/{repo}/commits?since={since}"
    commits = requests.get(commits_url, headers=headers).json()
    recent_commits = len(commits) if isinstance(commits, list) else 0

    # Get current UTC time
    now = datetime.utcnow().strftime("%Y-%m-%d %H:%M UTC")

    msg = "*Cleaner Royall Repo Weekly Summary*\n\n"
    msg += f"\\- Stars: {escape_md2(str(stars))}\n"
    msg += f"\\- Forks: {escape_md2(str(forks))}\n"
    msg += f"\\- Watchers : {escape_md2(str(watchers))}\n"
    msg += f"\\- Open issues : {escape_md2(str(open_issues))}\n"
    msg += f"\\- Closed issues : {escape_md2(str(closed_issues))}\n"
    msg += f"\\- Commits last 7 days : {escape_md2(str(recent_commits))}\n"
    msg += f"\\- Repo size : {escape_md2(str(size_mb))} MB\n"
    msg += f"\\- Report generated : {escape_md2(now)}"

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