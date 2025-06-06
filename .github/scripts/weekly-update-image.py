import requests
import json
import os
from datetime import datetime, timedelta
from PIL import Image, ImageDraw, ImageFont

def escape_md2(text):
    escape_chars = r'_*[]()~`>#+-=|{}.!'
    for c in escape_chars:
        text = text.replace(c, f'\\{c}')
    return text

def get_all_commits(repo, headers, since):
    page = 1
    all_commits = []
    while True:
        url = f"https://api.github.com/repos/{repo}/commits?since={since}&per_page=100&page={page}"
        res = requests.get(url, headers=headers)
        data = res.json()
        if not isinstance(data, list) or not data:
            break
        all_commits.extend(data)
        page += 1
    return all_commits

def create_image(text, filename="summary.png"):
    width, height = 800, 600
    bg_color = "#1e1e1e"
    text_color = "#ffffff"
    font_path = "/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf"  # adjust if needed

    image = Image.new("RGB", (width, height), color=bg_color)
    draw = ImageDraw.Draw(image)
    font = ImageFont.truetype(font_path, 28)

    draw.multiline_text((40, 40), text, fill=text_color, font=font, spacing=10)
    image.save(filename)

def send_image_to_telegram(token, chat_id, filename, caption="GitHub Weekly Summary"):
    with open(filename, 'rb') as f:
        res = requests.post(
            f"https://api.telegram.org/bot{token}/sendPhoto",
            data={"chat_id": chat_id, "caption": caption},
            files={"photo": f}
        )
    print("Telegram Image Response:", res.text)
    if not res.ok or '"ok":false' in res.text:
        raise Exception("Telegram API error.")

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

    since = (datetime.utcnow() - timedelta(days=7)).isoformat() + 'Z'
    commits = get_all_commits(repo, headers, since)
    recent_commits = len(commits)

    now = datetime.utcnow().strftime("%Y-%m-%d")

    msg = "Weekly Summary of GitHub Repo\n"
    msg += f"- Stars: {stars}\n"
    msg += f"- Forks: {forks}\n"
    msg += f"- Watchers: {watchers}\n"
    msg += f"- Open issues: {open_issues}\n"
    msg += f"- Closed issues: {closed_issues}\n"
    msg += f"- Commits last 7 days: {recent_commits}\n"
    msg += f"- Repo size: {size_mb} MB\n"
    msg += f"- Report generated: {now}"

    create_image(msg, "summary.png")
    send_image_to_telegram(tg_token, tg_chat_id, "summary.png")

if __name__ == "__main__":
    main()