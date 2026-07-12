#!/bin/sh

# Predefine choice: 1 for BGMI, 2 for Global
choice=X

if [ "$choice" = "1" ]; then
    PKG="com.pubg.imobile"
elif [ "$choice" = "2" ]; then
    PKG="com.tencent.ig"
else
    echo "Invalid selection. Exiting."
    exit 1
fi

# begin of Script


ID=$(grep $PKG /data/system/users/0/settings_ssaid.xml | awk -F'"' '{print $6}')

P=""
for i in $(seq 16); do
    P=$P$(uuidgen | head -c 1 | tr -d '-')
done

sed -i s/$ID/$P/g /data/system/users/0/settings_ssaid.xml

echo -e "--- Android ID changed successfully ---"
echo -e "--- Will take effect after reboot ---"
echo -e "--- Make sure to install and open the game once before the ID change takes effect! ---"
echo -e "--- After modification, run the game cleaning script again and reboot the device ---"