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


#Output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./fact.sh
Enter the no to find the factorial of no:
5
factorial of the given no  is 120

