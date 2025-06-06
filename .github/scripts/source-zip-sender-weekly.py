import requests
import os
from datetime import datetime

def main():
    repo = os.getenv("REPO")  # e.g. "araafroyall/Cleaner-Royall"
    tg_token = os.getenv("TELEGRAM_TOKEN")
    tg_chat_id = os.getenv("TELEGRAM_CHAT_ID")

    zip_url = f"https://github.com/{repo}/archive/refs/heads/main.zip"  # adjust if not 'main'

    r = requests.get(zip_url)
    r.raise_for_status()

    with open("CleanerRoyall.zip", "wb") as f:
        f.write(r.content)

    today = datetime.utcnow().strftime("%d/%m/%Y")
    caption = f"Cleaner Royall Weekly Source Code\nDate : {today}"

    with open("CleanerRoyall.zip", "rb") as f:
        res = requests.post(
            f"https://api.telegram.org/bot{tg_token}/sendDocument",
            data={
                "chat_id": tg_chat_id,
                "caption": caption
            },
            files={"document": ("CleanerRoyall.zip", f, "application/zip")}
        )

    print("Telegram response:", res.text)
    res.raise_for_status()
    if '"ok":false' in res.text:
        raise Exception("Telegram API error detected.")

if __name__ == "__main__":
    main()