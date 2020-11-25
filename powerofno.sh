#!/bin/bash 
read -p "Enter the number: " number
power=1 
while [ $number -ne 0 ]
do
	power=$(( power * 2 ))
	if [ $power -le 256 ]
	then
		echo $power
	fi
	((--number))
done
#output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./powerofno.sh
Enter the number: 98
2
4
8
16
32
64
128
256
-9223372036854775808
0

