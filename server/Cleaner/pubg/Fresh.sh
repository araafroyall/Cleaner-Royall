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

# begin of Script

# Target directories based on package
TDIR1="/data/data/$PNAME/"
TDIR2="/storage/emulated/0/Android/data/$PNAME/"

# Check if TDIR1 exists
if [ ! -d "$TDIR1" ]; then
    echo "Target directory not found: $TDIR1"
    exit 1
fi

# Delete all subdirectories in TDIR1
echo "Deleting all subdirectories in $TDIR1..."
for dir in "$TDIR1"*/; do
    [ -d "$dir" ] && echo "Removing: $dir" && rm -rf "$dir"
done

# Delete TDIR2 (cache and full folder)
if [ -d "$TDIR2" ]; then
    echo "Deleting entire folder: $TDIR2"
    rm -rf "$TDIR2"
else
    echo "Directory not found: $TDIR2"
fi

# cleaning package data

pm clear $PNAME


echo "Aggressive cleanup complete for $PNAME."