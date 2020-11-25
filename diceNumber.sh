#!/bin/bash -x
randomNumber=$(( RANDOM%6+1))
echo "Randomly generated dice number between 1 to 6:" $randomNumber

'<<
#Output:
#Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./diceNumber.sh
+ randomNumber=5
+ echo 'Randomly generated dice number between 1 to 6:' 5
Randomly generated dice number between 1 to 6: 5
'
