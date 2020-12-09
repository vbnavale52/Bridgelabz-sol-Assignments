package assignment;

import java.util.Scanner;

public class MinOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number a");
		int a=sc.nextInt();
		System.out.println("Enter Your Number b");
		int b=sc.nextInt();
		System.out.println("Enter Your Number c");		
		int c=sc.nextInt();
		
	if(a<=b && a<=c)
	{
		System.out.println("Min Of Number  ="+a);
		
	}
	else if(b<=c )
	{
		System.out.println("Min of Number  ="+b);
	}
	else 
	{
		System.out.println("Min Of number = "+c);	
	}
	
	sc.close();
	
	
		/*
		int a=15;
		int b=10;
		int c=45;
		
		if(a<=b && a<=c)
		{
			System.out.println("Min Of number "+a);
		}
		else if(b<=c)
		{
			System.out.println("Min fo Number"+b);
		}
			else
				System.out.println("Min of Number"+c);
		*/
	}

}
