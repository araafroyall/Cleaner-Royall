# Created by AraafRoyall❂



# Begin of Script...

if [ -e $MODPATH/CleanerLitePro3.0.apk ]; then
  echo "Processing"
else
  echo "Module Damaged , Download again"
  exit 1
fi


print Installing Package
pm install $MODPATH/CleanerLitePro3.0.apk


print checking installation 

if pm list packages | grep -q cleaner.lite.pro; then
    echo "App Install Sucess"
else
    echo "Something went wrong , please install manually"

fi





ui_print "[*] Setting executable permissions..."
set_perm_recursive "$MODPATH/system/bin" root root 0777 0755
ui_print "[*] All permissions set..."
ui_print "[*] Done..."

ui_print "[*] This Module made by AraafRoyall"
