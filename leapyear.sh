#!/bin/bash 
echo "Enter year "
read -p " " year
if [ $year -gt 1582 -a $year -lt 10000 ]
then
	if  [ $(($year % 4)) -eq 0 ] && [ $(($year % 100)) -ne 0 ] || [ $(($year % 400)) -eq 0 ]
	then 
		echo  $year "is leap year"
	else
		echo $year "is not leap year"
	fi
else
	echo "Please Enter valid year"
fi


#Output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./leapyear.sh
Enter year
 2022
2022 is not leap year
