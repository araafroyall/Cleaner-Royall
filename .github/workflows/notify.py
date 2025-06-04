import os
import json
import re
import requests

def escape_md2(text):
    # Escape Telegram MarkdownV2 special characters exactly
    escape_chars = r'_*[]()~`>#+-=|{}.!'
    return re.sub(f'([{re.escape(escape_chars)}])', r'\\\1', text or '')

def list_files(files_list):
    if not files_list:
        return "None"
    return "\n".join(f"- {escape_md2(f)}" for f in files_list)

def main():
    telegram_token = os.environ.get("TELEGRAM_TOKEN")
    telegram_chat_id = os.environ.get("TELEGRAM_CHAT_ID")
    event_path = os.environ.get("GITHUB_EVENT_PATH")

    if not telegram_token or not telegram_chat_id or not event_path:
        print("Missing environment variables.")
        exit(1)

    if not os.path.exists(event_path):
        print("GitHub event JSON file not found.")
        exit(1)

    with open(event_path, 'r', encoding='utf-8') as f:
        event = json.load(f)

    event_name = os.environ.get("GITHUB_EVENT_NAME", "")
    actor = os.environ.get("GITHUB_ACTOR", "")
    repo = os.environ.get("GITHUB_REPOSITORY", "")
    action = event.get("action", "")

    safe_actor = escape_md2(actor)
    safe_repo = escape_md2(repo)
    safe_action = escape_md2(action)
    safe_event_name = escape_md2(event_name)
    event_url = f"https://github.com/{repo}"

    msg = "*GitHub Action Report*\n"
    msg += f"*Event:* {safe_event_name}\n"
    msg += f"*Action:* {safe_action}\n"
    msg += f"*Repo:* {safe_repo}\n"

    # Push
    if event_name == "push":
        head_commit = event.get("head_commit", {})
        commit_msg_raw = head_commit.get("message", "")
        commit_author_raw = head_commit.get("author", {}).get("name", "")
        files_added_raw = head_commit.get("added", [])
        files_modified_raw = head_commit.get("modified", [])
        files_removed_raw = head_commit.get("removed", [])
        event_url = head_commit.get("url", event_url)

        safe_commit_msg = escape_md2(commit_msg_raw)
        safe_commit_author = escape_md2(commit_author_raw)
        files_added = list_files(files_added_raw)
        files_modified = list_files(files_modified_raw)
        files_removed = list_files(files_removed_raw)

        msg += f"*Commit message:* {safe_commit_msg}\n"
        msg += f"*Author:* {safe_commit_author}\n"
        msg += f"*Files added:*\n{files_added}\n"
        msg += f"*Files modified:*\n{files_modified}\n"
        msg += f"*Files removed:*\n{files_removed}\n"

    # Issues
    if event_name == "issues":
        issue = event.get("issue", {})
        issue_title = issue.get("title", "")
        issue_body = issue.get("body", "")
        issue_url = issue.get("html_url", event_url)

        safe_issue_title = escape_md2(issue_title)
        safe_issue_body = escape_md2(issue_body)
        msg += f"*Issue Title:* {safe_issue_title}\n"
        msg += f"*Issue Body:* {safe_issue_body}\n"
        event_url = issue_url

    # Issue Comment
    if event_name == "issue_comment":
        issue = event.get("issue", {})
        comment = event.get("comment", {})
        issue_title = issue.get("title", "")
        comment_body = comment.get("body", "")
        comment_author = comment.get("user", {}).get("login", "")
        comment_url = comment.get("html_url", event_url)

        safe_issue_title = escape_md2(issue_title)
        safe_comment_body = escape_md2(comment_body)
        safe_comment_author = escape_md2(comment_author)
        msg += f"*Issue Title:* {safe_issue_title}\n"
        msg += f"*Comment Author:* {safe_comment_author}\n"
        msg += f"*Comment:* {safe_comment_body}\n"
        event_url = comment_url

    # Pull Request
    if event_name == "pull_request":
        pr = event.get("pull_request", {})
        pr_title = pr.get("title", "")
        pr_body = pr.get("body", "")
        pr_url = pr.get("html_url", event_url)
        pr_state = pr.get("state", "")

        safe_pr_title = escape_md2(pr_title)
        safe_pr_body = escape_md2(pr_body)
        safe_pr_state = escape_md2(pr_state)
        msg += f"*Pull Request Title:* {safe_pr_title}\n"
        msg += f"*PR State:* {safe_pr_state}\n"
        msg += f"*PR Body:* {safe_pr_body}\n"
        event_url = pr_url

    # Release
    if event_name == "release":
        release = event.get("release", {})
        rel_name = release.get("name", "")
        rel_tag = release.get("tag_name", "")
        rel_body = release.get("body", "")
        rel_url = release.get("html_url", event_url)

        safe_rel_name = escape_md2(rel_name)
        safe_rel_tag = escape_md2(rel_tag)
        safe_rel_body = escape_md2(rel_body)
        msg += f"*Release Name:* {safe_rel_name}\n"
        msg += f"*Release Tag:* {safe_rel_tag}\n"
        msg += f"*Release Notes:* {safe_rel_body}\n"
        event_url = rel_url

    # Create
    if event_name == "create":
        ref_type = event.get("ref_type", "")
        ref = event.get("ref", "")
        safe_ref_type = escape_md2(ref_type)
        safe_ref = escape_md2(ref)
        msg += f"*Created {safe_ref_type}:* {safe_ref}\n"

    # Delete
    if event_name == "delete":
        ref_type = event.get("ref_type", "")
        ref = event.get("ref", "")
        safe_ref_type = escape_md2(ref_type)
        safe_ref = escape_md2(ref)
        msg += f"*Deleted {safe_ref_type}:* {safe_ref}\n"

    # Discussion Comment
    if event_name == "discussion_comment":
        discussion = event.get("discussion", {})
        comment = event.get("comment", {})
        disc_title = discussion.get("title", "")
        disc_body = discussion.get("body", "")
        comment_body = comment.get("body", "")

        safe_disc_title = escape_md2(disc_title)
        safe_disc_body = escape_md2(disc_body)
        safe_comment_body = escape_md2(comment_body)
        msg += f"*Discussion Title:* {safe_disc_title}\n"
        msg += f"*Discussion Body:* {safe_disc_body}\n"
        msg += f"*Comment:* {safe_comment_body}\n"

    # Repository Dispatch
    if event_name == "repository_dispatch":
        msg += "Repository dispatch event triggered.\n"

    # Workflow Dispatch
    if event_name == "workflow_dispatch":
        msg += "Workflow dispatch event triggered.\n"

    # Fork
    if event_name == "fork":
        forkee = event.get("forkee", {})
        forked_from = forkee.get("full_name", "")
        forked_url = forkee.get("html_url", event_url)

        safe_forked_from = escape_md2(forked_from)
        msg += f"*Repo forked from:* {safe_forked_from}\n"
        event_url = forked_url

    # Watch
    if event_name == "watch":
        msg += "Repository starred\n"

    msg += f"\n[🔗 View on GitHub]({event_url})"

    # Send to Telegram API
    url = f"https://api.telegram.org/bot{telegram_token}/sendMessage"
    payload = {
        "chat_id": telegram_chat_id,
        "text": msg,
        "parse_mode": "MarkdownV2",
        "disable_web_page_preview": True
    }

    response = requests.post(url, data=payload)
    result = response.json()

    if not result.get("ok", False):
        print("❌ Failed to send Telegram notification.")
        print(result)
        exit(1)
    else:
        print("✅ Telegram notification sent successfully.")

if __name__ == "__main__":
    main()