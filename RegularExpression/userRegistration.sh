#! /bin/bash
echo "****USER REGISTRATION******"
exit=0
while [ $exit -ne 1 ]
do
echo "Please Select Your Choice here 1.FIRST_NAME 2.LAST_NAME 3.EMAIL 4.MO_NUMBER 5.PASSWORD 6.exit"
read userChoice
case $userChoice in
1)
	while true
	do
    	read -p "Enter your Nane: " name
    	echo
    	if [[ "$name" =~ ^[A-Z][a-z][A-Za-z]{3,}$ ]]
    	then
        	echo "Name : $name is valid."
        	break
    	else
        	echo "Name $name is invalid."
    	fi
	done


;;
2)
	while true
do
    read -p "Enter your LastNane: " name
    echo
    if [[ "$name" =~ ^[A-Z][a-z][A-Za-z]{3,15}$ ]]
    then
        echo "LastName : $name is valid."
        break
    else
        echo "LastName $name is invalid."
    fi
done


;;
3)

read -p "Enter your email: " email

    if [[ "$email" =~ ^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]{2,5}+([.][a-zA-Z]+)([.][a-zA-Z]{2})$ ]]
    then
        echo "Email address $email is valid."
        break
    else
        echo "Email address $email is invalid."
    fi


;;
4)

while true
do
    read -p "Enter your Mobile no: " number
    echo
    if [[ "$number" =~ ^[0-9]{2,2}([ ][0-9]{10,10})$ ]]
    then
        echo "Mobile no $number is valid."
        break
    else
        echo "Mobile no $number is invalid."
    fi
done
;;
5)

 read -p "Enter your password: " s

    if [[ $s =~ ^(?=[a-zA-Z0-9#@$?]{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9]).* ]]
    then
        echo "password : $s is valid."

    else
        echo "password : $s is invalid."
    fi



;;

6)
exit=1
;;

esac
done
