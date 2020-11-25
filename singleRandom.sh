#!/bin/bash -x
randomNumber=$(( RANDOM%10 ))
echo "Single digit random number is :" $randomNumber


'<<
#Output:
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./singleRandom.sh
+ randomNumber=2
+ echo 'Single digit random number is :' 2
Single digit random number is : 2
>>'




