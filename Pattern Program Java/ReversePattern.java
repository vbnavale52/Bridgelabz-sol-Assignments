package com.pattern;

import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows :");
		int no_rows=sc.nextInt();
		for(int rows=no_rows;rows>=1;rows--)
		{
			for(int column=1;column<=rows;column++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
/*    Enter no of rows :
5
* * * * * 
* * * * 
* * * 
* * 
*

*/ 
