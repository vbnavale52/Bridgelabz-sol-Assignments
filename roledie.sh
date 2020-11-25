#!/bin/bash
declare -A rollDie
	echo "${rollDie[@]}"
	result=1
while [ $(( rollDie[$result] )) -ne 10 ]
do
	result=$((RANDOM%6+1))
	rollDie[$result]=$((rollDie[$result]+1))
	echo "  "
	echo "${rollDie[@]}"
	echo "  "
done
	echo "key" "${!rollDie[@]}"
length=${#rollDie[@]}
	echo "length:"$length 
minimumValue=$((rollDie[1]))
maximumValue=0

for (( index=1; index<=length; index++ ))
do
	if [ $((rollDie[$index])) -gt  $maximumValue ]
	then
		maximum=$((rollDie[$index]))
	fi

	if [ $((rollDie[$index])) -lt  $minimumValue ]
	then
		minimum=$((rollDie[$index]))	
	fi
done
echo "Minnimum Number" "$minimum"
echo "Maximum Number" "$maximum"



#output

Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./roledie.sh


1


2


1 2


2 2


2 2 1


2 2 1 1


2 3 1 1


2 3 1 1 1


2 3 1 1 2


2 3 1 1 1 2


2 3 1 2 1 2


2 3 1 2 2 2


2 3 2 2 2 2


2 3 3 2 2 2


2 3 3 3 2 2


3 3 3 3 2 2


3 3 3 3 2 3


3 3 3 3 2 4


3 3 3 4 2 4


3 3 3 5 2 4


3 3 4 5 2 4


3 3 4 6 2 4


3 4 4 6 2 4


3 4 4 7 2 4


3 4 5 7 2 4


3 5 5 7 2 4


3 6 5 7 2 4


3 6 5 7 2 5


3 6 5 7 3 5


4 6 5 7 3 5


4 7 5 7 3 5


4 7 5 8 3 5


4 8 5 8 3 5


4 8 5 8 4 5


4 8 5 8 4 6


4 8 6 8 4 6


4 8 6 9 4 6


4 8 6 9 5 6


4 8 6 9 5 7


4 8 6 9 5 8


5 8 6 9 5 8


5 9 6 9 5 8


5 9 6 9 6 8


5 9 6 9 6 9


6 9 6 9 6 9


6 10 6 9 6 9

key 1 2 3 4 5 6
length:6
Minnimum Number
Maximum Number 9

