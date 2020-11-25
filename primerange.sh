#!/bin/bash 

read -p "Enter Start Point : " start
read -p "Enter End Point : " end

for (( index=$start; index<=$end; index++ ))
do
	count=1
	for (( indexOne=2; indexOne<=$index; indexOne++ ))
	do
		if [ $(( index % indexOne )) -eq 0 ]
		then
			count=$(( count + 1 ))
		fi
	done

	if [[ $count -le 2 ]] && [[ $index -ne 1 ]]
	then
		echo -n $index "........... "
	fi
done

#output

Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./primerange.sh
Enter Start Point : 1
Enter End Point : 10
2 ........... 3 ........... 5 ........... 7 ...........
