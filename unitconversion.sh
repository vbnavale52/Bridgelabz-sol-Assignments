#!/bin/bash 

read -p "Enter the Inch :" inch
firstResult=$(( $inch/12 ))
echo $inch " Inch is equal to" $firstResult "Feet"

read -p "Enter the feet :" feet
secondResult=$(( $feet*12 ))
echo  $feet "feet is equal to " $secondResult "inch"


meter=`echo  "scale=2; (60/3.2808) * (40/3.2808)" | bc`
echo "60feet * 40feet is equal to "$meter "meter"

area=`echo "scale=2; $meter/4047 *25" | bc`
echo "Area of 25 plts in acres are "$arg


#Output
Rohit@DESKTOP-3TGP0OF MINGW64 ~/vinod (Demo)
$ ./unitconversion.sh
Enter the Inch :23
23  Inch is equal to 1 Feet
Enter the feet :44
44 feet is equal to  528 inch

