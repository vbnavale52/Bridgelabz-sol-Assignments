/**
 * 
 * Write a program that plays Rock,Paper,Scissors better than Random against human.
 * Try to exploit that humans are very bad at generating random numbers
 * 
 **/

package review.day2;

import java.util.Scanner;

public class RockPaperScissors
{
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
					System.out.println(RandomUtils.selectRandomly().toString().equals("Rock")  ?  " Rock Win  ***"  :  " Sorry Rock !!" );
	
					break;
	
				case 2:
					System.out.println(RandomUtils.selectRandomly().toString().equals("Paper")  ?  " Paper Win  ***"  :  " Sorry Paper !!" );

					break;
	
				case 3:
					System.out.println(RandomUtils.selectRandomly().toString().equals("Scissors")  ?  " Scissors Win  ***"  :  " Sorry Scissors !!" );

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

}
