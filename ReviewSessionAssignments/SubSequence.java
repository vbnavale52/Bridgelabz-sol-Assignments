//To find Longest sub sequence of string 

package review.day2;

import java.util.Scanner;

public class SubSequence 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string : ");
		String firstString = sc.next();
		String secondString = sc.next();
		System.out.println(seq(firstString, secondString));
	}
	
	static int seq(String firstString, String secondString)
	{
		int count = 0;
		char[] firstStr = firstString.toCharArray();
		char[] secondStr = secondString.toCharArray();
		for (int i = 0; i < firstStr.length; i++) 
		{
			for (int j = 0; j < secondStr.length; j++) 
			{
				if (firstStr[i] == secondStr[j])
				{
					System.out.print(firstStr[i] + " ");
					count++;
				}
			}
		}
		return count;
	}
}