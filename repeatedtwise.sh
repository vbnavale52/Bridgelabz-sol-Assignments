#!/bin/bash  
for(( index=1; index<100; index++ ))
do
number=$index

remainder=`expr $index % 10 `
number=`expr $index / 10 `

if [ $remainder -eq $number ]
then
    echo "To print the repeated twice:" $index
    array=($index)
fi
done

#output

Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./repeatedtwise.sh
To print the repeated twice: 11
To print the repeated twice: 22
To print the repeated twice: 33
To print the repeated twice: 44
To print the repeated twice: 55
To print the repeated twice: 66
To print the repeated twice: 77
To print the repeated twice: 88
To print the repeated twice: 99


