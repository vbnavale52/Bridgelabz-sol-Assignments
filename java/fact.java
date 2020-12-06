package Practice;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no:");
		int fact=sc.nextInt();
		int res=1;
		/*int res=1;
		int counter=0;
		while(fact>counter)
		{
			counter=counter+1;
			res=res*counter;
		}
		System.out.println("Factorial is "+res);*/
		for (int i = 1; i <=fact; i++)
		{
			res=res*i;
		}
		System.out.println(res);
	}

}
