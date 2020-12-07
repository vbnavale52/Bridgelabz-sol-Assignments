package Practice;	//Package Name

import java.util.Scanner;	//java util pkg for scanner

public class NPrimeNumbers 	// class name NPrimeNumber
{
	public static void main(String[] args) 	// main method of program
	{
		Scanner sc=new Scanner(System.in);	//to get the input from user 
		System.out.println("Enter Range::");	//display the msg on screen
		int range=sc.nextInt();		//get the input from user and store it into the range variable
		for (int i = 1; i <= range; i++) 	//for loop start with 1 and end with range
		{
			int count=0;					// set the count variable with 0
			for (int j = i; j >= 1;j--)		// take for loop for j which start from i and end with 1
			{
				if(i%j==0)		// check the condition if i%j==0
					count++;	// increment the count value by one if the above condition is true
			}
			if(count==2)		//validating no is prime or not
				System.out.println(i); 	//printing prime no
		}

	}

}
/*
 *  Enter Range::
10
2
3
5
7
*/
