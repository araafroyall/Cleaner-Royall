#!/bin/sh

# Predefine choice: 1 for BGMI, 2 for Global
choice=X

if [ "$choice" = "1" ]; then
    PNAME="com.pubg.imobile"
elif [ "$choice" = "2" ]; then
    PNAME="com.tencent.ig"
else
    echo "Invalid selection. Exiting."
    exit 1
fi



# Define target directories based on selected package
TDIR1="/data/data/$PNAME/"
TDIR2="/storage/emulated/0/Android/data/$PNAME/cache/"
TDIR3="/storage/emulated/0/Android/data/$PNAME/files/"
TDIR4="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/"
TDIR5="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/"
TDIR6="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/"
TDIR7="/storage/emulated/0/Android/data/$PNAME/files/ProgramBinaryCache/"
TDIR8="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/SaveGames/"
TDIR9="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Config/"
TDIR10="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/avatarpaks/"

# Start cleanup

if [ ! -d "$TDIR1" ]; then
    echo "Directory not found: $TDIR1"
    exit 1
fi

echo "Deleting all subdirectories in $TDIR1..."
for dir in "$TDIR1"*/; do
    [ -d "$dir" ] && rm -rf "$dir"
done

[ -d "$TDIR2" ] && rm -rf "$TDIR2"
[ -d "$TDIR7" ] && rm -rf "$TDIR7"
[ -d "$TDIR8" ] && rm -rf "$TDIR8"
[ -d "$TDIR9" ] && rm -rf "$TDIR9"
[ -d "$TDIR10" ] && rm -rf "$TDIR10"

if [ -d "$TDIR3" ]; then
    echo "Cleaning $TDIR3 except UE4Game and ProgramBinaryCache..."
    find "$TDIR3" -mindepth 1 -maxdepth 1 ! -name 'UE4Game' ! -name 'ProgramBinaryCache' -exec rm -rf {} \;
fi

if [ -d "$TDIR4" ]; then
    echo "Cleaning $TDIR4 except ShadowTrackerExtra..."
    find "$TDIR4" -mindepth 1 -maxdepth 1 ! -name 'ShadowTrackerExtra' -exec rm -rf {} \;
fi

if [ -d "$TDIR5" ]; then
    echo "Cleaning $TDIR5 while keeping Config, Paks, SaveGames, and SrcVersion.ini..."
    find "$TDIR5" -mindepth 1 -maxdepth 1 \
        ! -name 'Config' ! -name 'Paks' ! -name 'SaveGames' ! -name 'SrcVersion.ini' \
        -exec rm -rf {} \;
fi

if [ -d "$TDIR6" ]; then
    echo "Removing specific eifsCache folders from $TDIR6..."
    for cache in eifsCache1 eifsCache2 eifsCache3 eifsCache5; do
        [ -d "$TDIR6/$cache" ] && rm -rf "$TDIR6/$cache"
    done
fi

echo "Cleanup complete for $PNAME."