package com.pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		
		int no_rows=sc.nextInt();
		for(int row=1;row<=no_rows;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(temp++ +" " );
				
			}
		System.out.println();
		}
		
	}

}
/*    Enter no of rows : 
5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 


*/