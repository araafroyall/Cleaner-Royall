# Update soon


if [ -e $MODPATH/CleanerLitePro3.0.apk ]; then
  echo "Processing..."
else
  echo "Module is Damaged , Download again"
  exit 1
fi



# Check if the "cleaner.lite.pro" package is installed
if pm list packages | grep -q cleaner.lite.pro; then
    echo "Package found: cleaner.lite.pro"
else
    echo "Package not found: cleaner.lite.pro"
fi
