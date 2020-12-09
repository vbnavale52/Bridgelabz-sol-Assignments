/* 9.	Check if a number is Armstrong number. */


package assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=sc.nextInt();
		int rem=0;
		int temp=num;
		int length=0;
		while(num>0)
		{
			length+=1;
			num/=10;		
		}
		num=temp;
		int arm=0;
		while(num>0)
		{
			rem=num%10;
			int  temp1=1;
			for (int i = 0; i < length; i++)
			{
				temp1=temp1*rem;	
			}
			arm=arm+temp1;
			num/=10;
		}
		if(arm==temp)
			System.out.print("Number "+temp+" Is Amstrong Number");
		else
			System.out.print("Number  '"+temp+ "' is not amstrong");

		
	}

}
