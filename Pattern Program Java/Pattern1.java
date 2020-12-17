package com.pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No Of rows :");
	int no_rows=sc.nextInt();
	
	
	for(int row=1;row<=no_rows;row++)
	{
		for(int column=1;column<=row;column++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
	}
	
	}

}

/*   Enter No Of rows :
5
* 
* * 
* * * 
* * * * 
* * * * * 

*/