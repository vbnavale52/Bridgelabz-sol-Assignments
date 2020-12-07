package Practice; 	// package name

import java.util.Scanner;	//utility pkg to import the scanner class

public class Palindrome {	//class name

	public static void main(String[] args) {	//main method of the class
		
				Scanner sc=new Scanner(System.in);	//creare the scanner class object to take the input from user
				System.out.println("Enter a no. ");	// display the msg on screen
				int num=sc.nextInt();	//take the input from user and store it into num var
				int num1=num;		//create the copy of num var
				int rev=0,rem=0; 	// create two var with 0
				while(num != 0)		// while loop initialize till no not equal to zero
				{
					rem=num%10;		//mod the no with 10
					rev=rev*10+rem;		//set rev*10+rem
					num/=10;		//devide the no with val 10
				}
				if(num1==rev)	//check reverse no with original number
					System.out.println("Palindrome Number");	//if the condition is true then print the msg
				else
					System.out.println("Not a Palindrome  Number");	//if condition is false
			}
		}
	/*::Output::
	Enter a no. 
	12321
	Palindrome Number

	*/


