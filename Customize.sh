# Update soon





# Check if the "cleaner.lite.pro" package is installed
if pm list packages | grep -q cleaner.lite.pro; then
    echo "Package found: cleaner.lite.pro"
else
    echo "Package not found: cleaner.lite.pro"
fi
