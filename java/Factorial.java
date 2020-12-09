/* Write a program to find factorial of a given number.*/

package assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number ");
            int facto= sc.nextInt();
		int fact=1;
		for(int i=1;i<=facto;i++)
		{
			fact=fact*i;
		}
            
		System.out.println("Factorial of Number Is "+fact);
            
            sc.close();
		
		
	}

}
