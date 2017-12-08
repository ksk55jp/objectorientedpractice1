#!/bin/bash
clear
echo "[DEBUG] I'm in below directory"
pwd

echo "[DEBUG] Deleting *.class file here and there"
# here
rm -f *.class
# there
rm -f ../greetingmodel/*.class
echo "[DEBUG] Deleting *.class file here and there done"



echo "[DEBUG] compiling dependent model package"
javac ../greetingmodel/*.java
result=$?
if [ $result=0 ];then
  echo "[DEBUG] Success? result is $result"
else
  echo "[DEBUG] Failed? result is $result"
  exit 1
fi

echo "[DEBUG] compiling service package"
javac -classpath .. *.java 
result=$?
if [ $result=0 ];then
  echo "[DEBUG] Success? result is $result"
else
  echo "[DEBUG] Failed? result is $result"
  exit 2
fi

java_main_class=greetingservice/Launcher
echo "[DEBUG] I'm launching java program $java_main_class"
java --class-path .. $java_main_class
echo "[DEBUG] Java exit status($?)"
exit 0
