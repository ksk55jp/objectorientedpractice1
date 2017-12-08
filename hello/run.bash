#!/bin/bash
clear
echo "[DEBUG] I'm in below directory"
pwd

echo "[DEBUG] I'm compiling java source code"
javac *.java
result=$?
if [ $result=0 ];then
  echo "[DEBUG] Success?"
else
  echo "[DEBUG] Failed?"
  exit 1
fi
echo "[DEBUG] I'm launching java program hello/Launcher"
time java --class-path .. hello/Launcher
echo "[DEBUG] java exit status ($?)"

exit 0
