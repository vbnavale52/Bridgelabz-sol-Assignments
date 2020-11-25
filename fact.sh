#!/bin/bash
echo "Enter the no to find the factorial of no:"
read fact

ans=1
counter=0
while [ $fact -ne $counter ]
do
        counter=`expr $counter + 1`
        ans=`expr $ans \* $counter`
done
echo "factorial of the given no  is $ans"
