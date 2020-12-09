/*Write a program to find m to the power n */


package assignment;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base Number ");
		int base=sc.nextInt();
		System.out.println("Enter Exponent Number ");
		int exp=sc.nextInt();
		int res=1;
		for (int i = 1; i <= exp; i++) 
		{
			res=res*base;
		}
		System.out.println("Power =  "+res);
sc.close();
	
	}

}
