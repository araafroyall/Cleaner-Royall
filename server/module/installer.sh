
# Script Created by @AraafRoyall

INT=$(ls -d /data/media/0 /storage/emulated/0 /sdcard 2>/dev/null | head -n 1)

# -------------------------------------------#

echo "Mounting /data"
mount -o remount,rw /data >/dev/null 2>&1

echo "Installing Module"

MSK="/data/adb/modules"
MDK="$MSK/CleanerRoyall"

echo "Making Module Path..."

if [ ! -d "$MDK/xdata" ]; then
  if ! { mkdir -p "$MDK/xdata" || install -d "$MDK/xdata"; }; then
    echo "Failed to Create Module Path"
    royallaraaf
    exit 1
  fi
fi


echo "Module Path Created."

echo "Making module.prop file..."

echo "id=CleanerRoyall
name=Cleaner Royall
version=2.4
versionCode=2
author=Araaf Royall
description=Ultimate Systemless Module for Automated background cleaner at set intervals
" > "$MDK/module.prop" || { echo "Failed to Create module.prop"; royallaraaf; exit 1; }

echo "Module.prop File Successfully Created."

echo "Making log file"
echo "[$(date '+%Y-%m-%d %I:%M:%S %p')] - Module Installed" > "$MDK/xdata/log.txt"
echo "Log file created successfully"

echo "Making duration file"
echo "3600" > "$MDK/xdata/duration.txt"
echo "Duration file created successfully"

touch "$MDK/xdata/scripts.txt" > /dev/null 2>&1


# ---------------------------------------
#                 PART 2
# ---------------------------------------


echo "Making service file"

{
cat << 'EOF' > "$MDK/service.sh"
#!/system/bin/sh
#Script created by AraafRoyall

# ---------------------------------------

while [ "$(getprop sys.boot_completed)" != "1" ]; do sleep 3; done

MODDIR="${0%/*}"
LOGFILE="$MODDIR/xdata/log.txt"

if [ ! -f "$LOGFILE" ]; then
echo "Making Log File" > $LOGFILE
fi

logg() {
        [ -f "$MODDIR/xdata/log" ] && echo "[$(date '+%Y-%m-%d %I:%M:%S %p')] - $1" >> "$LOGFILE" || echo "$1" > /dev/null 2>&1
}

rm -rf $MODDIR/xdata/run

if [ ! -f "$MODDIR/xdata/bootstart" ]; then
logg "Start from boot is disabled"
exit 1
fi

logg "Starting From Boot"

if ! pm list packages | grep -q "Cleaner.Royall"; then
    rm -rf "/data/adb/modules/CleanerRoyall"
    exit 1
fi

if ! command -v nohup >/dev/null 2>&1; then
    logg "Disabled - nohup not found"
    exit 1
fi


if [ -f "$MODDIR/automatic.sh" ]; then
    nohup "$MODDIR/automatic.sh" &
logg "Auto Cleaning Started from Boot"
else
logg "Module is not properly Installed"
fi

sleep 2

if [ -f "$MODDIR/xdata/dalvikClean.sh" ]; then
   nohup "$MODDIR/xdata/dalvikClean.sh" &
   logg "Dalvik Cache Timer set for 3min"
fi

EOF
} || {
    echo "Failed to Create service.sh"
    royallaraaf
    exit 1
}

# -------------------------------------

echo "Checking Service & Granting Permission"

if [ ! -f "$MDK/service.sh" ]; then
  echo "Failed to Create Service.sh file, Exiting..."
  royallaraaf
  exit 1
else
  chmod 777 "$MDK/service.sh"
  echo "Check & Permission Done."
fi



# ---------------------------------------
#                 PART 3
# ---------------------------------------

echo "Making Cleaning Mechanism"

{
cat << 'EOG' > "$MDK/automatic.sh"
#!/system/bin/sh
# Created by Araaf Royall.
# ----------------------------------

MODDIR="/data/adb/modules/CleanerRoyall"
DATAP="$MODDIR/xdata"
LOGFILE="$MODDIR/xdata/log.txt"
DURATION="$MODDIR/xdata/duration.txt"
RUNN="$DATAP/scripts.txt"

if ! pm list packages | grep -q "Cleaner.Royall"; then
    rm -rf "/data/adb/modules/CleanerRoyall"
    exit 1
fi


if [ ! -f "$LOGFILE" ]; then
  echo "Initializing Records & Actions" > $LOGFILE
fi


if [ ! -f "$DATAP/scripts.txt" ]; then
  touch "$DATAP/scripts.txt" > /dev/null 2>&1
fi


if ! grep -qE '^[0-9]+$' "$DURATION"; then
    echo "1800" > "$DURATION"
fi

echo "x" > $MODDIR/xdata/run

# ----------------------------------

logg() {
        [ -f "$MODDIR/xdata/log" ] && echo "[$(date '+%Y-%m-%d %I:%M:%S %p')] - $1" >> "$LOGFILE" || echo "$1" > /dev/null 2>&1
}

maxRecord() {
    if command -v sed >/dev/null && command -v wc >/dev/null; then
        if [ "$(wc -l < "$LOGFILE")" -ge 30 ]; then
            sed -i '1,30d' "$LOGFILE" && logg "Deleted old Actions"
        fi  
    fi
}

notify() {
 {
su 2000 -c "cmd notification post -t 'Cleaner Royall Module' 'Tag' 'Background Cleaning has been performed.'" 
logg "Cleaning Notification Posted"
} || {
logg "Failed to Post Notification"
}
}

# ---------------------------------

while [ ! -f $MODDIR/disable ]; do
    
    chmod a+x $DATAP/* > /dev/null 2>&1

    while IFS= read -r script; do
        [ -z "$script" ] && continue
        sh "$DATAP/$script" > /dev/null 2>&1
        logg "Cleared $script"
        sleep 2
    done < "$RUNN"

    [ -f "$MODDIR/xdata/log" ] && maxRecord
    [ -f "$MODDIR/xdata/notify" ] && notify
    logg "Next Cycle - Waiting"

    [ -f $MODDIR/disable ] && break

    sleep $(cat "$DURATION")
done

rm -rf $MODDIR/xdata/run
logg "Disabled Background Cleaner"

EOG
} || {
    echo "Failed to Create automatic.sh"
    royallaraaf
    exit 1
}


echo "granting permission"


if [ ! -f "$MDK/automatic.sh" ]; then
        echo "Failed to Create Service.sh file, Exiting..."
         royallaraaf
          exit 1
else
 chmod 777 "$MDK/automatic.sh"
 echo "Check & Permission Done."

fi


echo "Finalizing..."
chmod -R a+w "$MDK" 2>/dev/null
echo "Module Installation Sucess."

echo "Now you can complete other setup"

