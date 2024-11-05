#!/bin/bash

# Dosyanın bulunduğu dizini al
FILE_PATH="$1"

# Dosya var mı kontrol et
if [[ ! -f "$FILE_PATH" ]]; then
  echo "File not found: $FILE_PATH"
  exit 1
fi

# Türkçe karakterlerin İngilizce karşılıklarını değiştir
sed -i '' -e 's/İ/I/g' \
           -e 's/ı/i/g' \
           -e 's/ç/c/g' \
           -e 's/ş/s/g' \
           -e 's/ö/o/g' \
           -e 's/ü/u/g' \
           -e 's/ğ/g/g' \
           "$FILE_PATH"

echo "Turkish chars replaced by English chars succesfully: $FILE_PATH"
