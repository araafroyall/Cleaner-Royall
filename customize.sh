#!/system/bin/sh
# by AraafRoyall






# Check if the "cleaner.lite.pro" package is installed
if pm list packages | grep -q cleaner.lite.pro; then
    echo "App is Already Installed Skipping"
else
    echo "installing package Cleaner Lite Pro"
   pm install $MODPATH/CleanerLitePro3.0.apk
   
fi

print checking if installed 

if pm list packages | grep -q cleaner.lite.pro; then
    echo "App is installed"
else
    echo "something went wrong please try manually installation"
   
fi


# removing Extra items






ui_print "[*] Setting executable permissions..."
set_perm_recursive "$MODPATH/system/bin" root root 0777 0755
ui_print "[*] All permissions set..."
ui_print "[*] Done..."

ui_print "[*] This Module made by AraafRoyall"
