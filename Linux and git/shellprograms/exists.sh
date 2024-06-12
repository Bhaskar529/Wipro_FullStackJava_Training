#!/bin/bash

read -p "enter the file :" filename

if [ -e $filename ]
then
 echo "file exists"
else
 echo "file not exits"
fi

echo "checking the read permission"

if [ -r $filename ]
then
 echo "file has read permission"
else
 eccho "file does not have read permission"
fi
