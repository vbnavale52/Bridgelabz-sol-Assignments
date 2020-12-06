package Practice;

import java.util.Scanner;

public class NPrimeNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range::");
		int range=sc.nextInt();
		for (int i = 1; i <= range; i++) 
		{
			int count=0;
			for (int j = i; j >= 1;j--)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}

	}

}
