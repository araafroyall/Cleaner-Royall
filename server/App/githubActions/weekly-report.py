import requests import json import os

def escape_md2(text): escape_chars = ['_', '*', '[', ']', '(', ')', '~', '`', '>', '#', '+', '-', '=', '|', '{', '}', '.', '!'] for char in escape_chars: text = text.replace(char, f"\{char}") return text

def get_repo_summary(token, repo): headers = {"Authorization": f"Bearer {token}"}

repo_data = requests.get(f"https://api.github.com/repos/{repo}", headers=headers).json()
issues_data = requests.get(f"https://api.github.com/search/issues?q=repo:{repo}+is:issue+is:closed", headers=headers).json()

open_issues = repo_data.get("open_issues_count", 0)
stars = repo_data.get("stargazers_count", 0)
size = repo_data.get("size", 0)
language = repo_data.get("language", "Unknown")
url = repo_data.get("html_url", f"https://github.com/{repo}")
closed_issues = issues_data.get("total_count", 0)

return open_issues, closed_issues, stars, size, language, url

def send_to_telegram(bot_token, chat_id, message): url = f"https://api.telegram.org/bot{bot_token}/sendMessage" data = { "chat_id": chat_id, "text": message, "parse_mode": "MarkdownV2", "disable_web_page_preview": True } response = requests.post(url, data=data) return response.json()

def main(): github_token = os.environ.get("GITHUB_TOKEN") telegram_token = os.environ.get("TELEGRAM_TOKEN") telegram_chat_id = os.environ.get("TELEGRAM_CHAT_ID") repo = os.environ.get("REPO", "araafroyall/Cleaner-Royall")

open_issues, closed_issues, stars, size, language, url = get_repo_summary(github_token, repo)

msg = "*Cleaner\\-Royall GitHub Repo Summary*\n"
msg += f"`{escape_md2(repo)}`\n{escape_md2(url)}\n\n"
msg += f"\- Stars: {escape_md2(str(stars))}\n"
msg += f"\- Codespace size: {escape_md2(str(size))} KB\n"
msg += f"\- Language: {escape_md2(language)}\n"
msg += f"\- Open issues: {escape_md2(str(open_issues))}\n"
msg += f"\- Closed issues: {escape_md2(str(closed_issues))}"

result = send_to_telegram(telegram_token, telegram_chat_id, msg)
print(json.dumps(result, indent=2))

if name == "main": main()

