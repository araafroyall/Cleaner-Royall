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


# begin of script

# Define dynamic paths
TDIR1="/data/data/$PNAME/"
TDIR2="/storage/emulated/0/Android/data/$PNAME/cache/"
TDIR3="/storage/emulated/0/Android/data/$PNAME/files/"
TDIR4="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/"
TDIR5="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/"
TDIR6="/storage/emulated/0/Android/data/$PNAME/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/"

# 1. Delete all subdirectories in data/data
if [ ! -d "$TDIR1" ]; then
    echo "Directory not found: $TDIR1"
    exit 1
fi

echo "Deleting all subdirectories in $TDIR1..."
for dir in "$TDIR1"*/; do
    [ -d "$dir" ] && echo "Removing: $dir" && rm -rf "$dir"
done

# 2. Delete the cache folder
if [ -d "$TDIR2" ]; then
    echo "Deleting cache directory: $TDIR2"
    rm -rf "$TDIR2"
else
    echo "Cache directory not found: $TDIR2"
fi

# 3. Delete everything in files except UE4Game and ProgramBinaryCache
if [ -d "$TDIR3" ]; then
    echo "Cleaning $TDIR3, keeping UE4Game and ProgramBinaryCache..."
    find "$TDIR3" -mindepth 1 -maxdepth 1 ! -name 'UE4Game' ! -name 'ProgramBinaryCache' -exec rm -rf {} \;
else
    echo "Directory not found: $TDIR3"
fi

# 4. Delete everything in UE4Game/ShadowTrackerExtra except ShadowTrackerExtra
if [ -d "$TDIR4" ]; then
    echo "Cleaning $TDIR4, keeping ShadowTrackerExtra..."
    find "$TDIR4" -mindepth 1 -maxdepth 1 ! -name 'ShadowTrackerExtra' -exec rm -rf {} \;
else
    echo "Directory not found: $TDIR4"
fi

# 5. Delete everything in Saved/ except Config, Paks, SaveGames, and SrcVersion.ini
if [ -d "$TDIR5" ]; then
    echo "Cleaning $TDIR5, keeping Config, Paks, SaveGames, and SrcVersion.ini..."
    find "$TDIR5" -mindepth 1 -maxdepth 1 \
        ! -name 'Config' ! -name 'Paks' ! -name 'SaveGames' ! -name 'SrcVersion.ini' \
        -exec rm -rf {} \;
else
    echo "Directory not found: $TDIR5"
fi

# 6. Delete specific cache folders in Paks
if [ -d "$TDIR6" ]; then
    echo "Deleting specific eifsCache folders in $TDIR6..."
    for cache in eifsCache1 eifsCache2 eifsCache3 eifsCache5; do
        if [ -d "$TDIR6/$cache" ]; then
            echo "Removing: $TDIR6/$cache"
            rm -rf "$TDIR6/$cache"
        else
            echo "Not found: $TDIR6/$cache"
        fi
    done
else
    echo "Directory not found: $TDIR6"
fi

echo "Cleanup completed for $PNAME."