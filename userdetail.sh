	
#! /bin/bash
declare -A User
AUTHOR="NandhaKumar"
settingKey=""
echo "******Address Book******"
echo "Please Select Your Choice here 1.Create 2.Retrive 3.Update 4.Delete"
read userChoice

function userDetails() {
User["NAME"]=$1
User["AGE"]=$2
User["MOBILENUMBER"]=$3
echo "Your Profile Is Created :)"
echo "${User[@]}"
}
function retrieveUser() {
User["NAME"]="Any Name"
User["AGE"]="Any Age"
User["MOBILENUMBER"]="Any Number"
length=${#User[@]}
if [ $length -eq 0 ]
then
echo "Sorry! Your Profile Is Empty :("
else
echo "Happy To Assist You :)"
echo "Your Profile :"
echo "${User[@]}"
fi
}

function updateUserInfo(){
if [ $1 -eq 1 ]
then
settingKey="NAME"
elif [$1 -eq 2 ]
then
settingKey="AGE"
else
settingKey="MOBILENUMBER"
fi
}

function businessLogic(){
echo "Welcome $2"
case $1 in
1)
echo "Hurray! Ready To Create :)"
read -p "Enter Your Fullname here : " fullname
read -p "Enter Your Age hee : " age
read -p "Enter Your Mobile Number : " mobilenumber
userDetails $fullname $age $mobilenumber
;;
2)
echo "Hurray! Ready To Retrive :)"
retrieveUser
;;
3)
echo "Hurray! Ready To Update :)"
echo "Which One Need To Update"
read -p "1.Name 2.Age 3.Mobile Number " updateUserInput
updateUserInfo $updateUserInput
;;
4)
echo "Hurray! Ready To Delete :("
;;
*)
echo "Please Enter Between 1 and 4 :("
;;
esac
}
businessLogic $userChoice $AUTHOR
