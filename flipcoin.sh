#!/bin/bash 

randomNumber=$(( RANDOM%2 ))

isFlipCoin=0

if [ $randomNumber -eq $isFlipCoin ]
then
	echo "Head"
else
	echo "Tail"
fi

#Output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./flipcoin.sh
Tail

