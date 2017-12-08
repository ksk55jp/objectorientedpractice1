#!/bin/bash
clear
echo "[DEBUG] I'm in below directory"
pwd

echo "[DEBUG] I'm compiling java source code"
result=$( javac *.java)
if [ $result=0 ];then
  echo "[DEBUG] Success?"
else
  echo "[DEBUG] Failed?"
  exit 1
fi
echo "[DEBUG] I'm launching java program hello/Launcher"
java --class-path /Users/keisuke.kawai/workspace/java/proj1 hello/Launcher
