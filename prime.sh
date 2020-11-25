#!/bin/bash 
read -p "Enter the number: " number

count=0

for (( index=1; index<=$number; index++ ))
do
	if [ $(( number % index )) -eq 0 ]
	then
		count=$(( count + 1 ))
	fi
done

if [ $count -eq 2 ]
then
	echo $number is Prime Number
else
	echo $number is not prime Number
fi

# Output

Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./prime.sh
Enter the number: 87
87 is not prime Number


