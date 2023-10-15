#!/system/bin/sh
# by AraafRoyall






# Check if the "cleaner.lite.pro" package is installed
if pm list packages | grep -q cleaner.lite.pro; then
    echo "Package found: cleaner.lite.pro"
else
    echo "Package not found: cleaner.lite.pro"
fi







ui_print "[*] Setting executable permissions..."
set_perm_recursive "$MODPATH/system/bin" root root 0777 0755
ui_print "[*] All permissions set..."
ui_print "[*] Done..."

ui_print "[*] This Module made by AraafRoyall"
