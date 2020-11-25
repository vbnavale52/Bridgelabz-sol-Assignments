#!/bin/bash
ispresent=1
randomNumber=$(( RANDOM%2 ))

if [ $randomNumber -eq $ispresent ]
then 
	echo "Employee is present"
else
	echo "Employee is abscent"
fi



#Output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./presentabsent.sh
Employee is abscent

