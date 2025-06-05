import requests
import json
import os
from datetime import datetime, timedelta, timezone

def escape_md2(text):
    escape_chars = r'_*[]()~`>#+-=|{}.!'
    text = text.replace('-', r'\-')
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
    forks = data.get("forks_count", 0)
    watchers = data.get("subscribers_count", 0)

    closed_issues = requests.get(
        f"https://api.github.com/search/issues?q=repo:{repo}+is:issue+is:closed",
        headers=headers
    ).json().get("total_count", 0)

    since = (datetime.now(timezone.utc) - timedelta(days=7)).isoformat()
    commits = requests.get(
        f"https://api.github.com/repos/{repo}/commits?since={since}",
        headers=headers
    ).json()

    commit_count = len(commits)

    authors = {}
    for commit in commits:
        author = commit.get("commit", {}).get("author", {}).get("name", "Unknown")
        authors[author] = authors.get(author, 0) + 1

    top_authors = sorted(authors.items(), key=lambda x: x[1], reverse=True)[:3]

    msg = "*Cleaner Royall Repo Weekly Summary*\n\n"
    msg += f"- Stars : {escape_md2(str(stars))}\n"
    msg += f"- Forks : {escape_md2(str(forks))}\n"
    msg += f"- Watchers : {escape_md2(str(watchers))}\n"
    msg += f"- Open issues : {escape_md2(str(open_issues))}\n"
    msg += f"- Closed issues : {escape_md2(str(closed_issues))}\n"
    msg += f"- Repo size : {escape_md2(str(size))} KB\n"
    msg += f"- Commits this week : {escape_md2(str(commit_count))}\n"

    if top_authors:
        msg += "- Top contributors this week:\n"
        for author, count in top_authors:
            msg += f"  - {escape_md2(author)} : {escape_md2(str(count))} commits\n"

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