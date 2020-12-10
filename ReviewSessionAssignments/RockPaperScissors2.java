/**
 * 
 * Write a program that plays Rock,Paper,Scissors better than Random against human.
 * Try to exploit that humans are very bad at generating random numbers
 * 
 **/

package review.day2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 
{
	static Random random=new Random();
	
	public static void main(String[] args) 
	{
		boolean exit = true;
		Scanner sc = new Scanner(System.in);
		while (exit) 
		{
			System.out.println("*******  OPTIONS  ********"
					+ "\n1.Rock"
					+ "\n2.Paper"
					+ "\n3.Scissors"
					+ "\n4.Exit"
					+ "\n----Select Your Option----");
			switch (sc.nextInt()) 
			{
				case 1: 
					System.out.println(selectRandomly().equals("Rock")  ?  " Rock Win  ***"  :  " Sorry Rock !!" );
	
					break;
	
				case 2:
					System.out.println(selectRandomly().equals("Paper")  ?  " Paper Win  ***"  :  " Sorry Paper !!" );

					break;
	
				case 3:
					System.out.println(selectRandomly().equals("Scissors")  ?  " Scissors Win  ***"  :  " Sorry Scissors !!" );

					break;
				case 4:
					System.out.println("!!! Good Bye !!!");
					exit = false;
	
					break;
	
				default:System.out.println("Invalid Option");
					break;
			}
		}
	}

	public static String selectRandomly() 
	{
		switch(random.nextInt(4))
		{
			case 0: return "Rock";

			case 1: return "Paper";
					
			case 2: return "Scissors";
				
			default:	return "Nothing" ;
		}
	
	}
}
