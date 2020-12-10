/**
 * 
 * Write a program that plays Rock,Paper,Scissors better than Random against human.
 * Try to exploit that humans are very bad at generating random numbers
 * 
 **/

package review.day2;

import java.util.Random;	//import the pkg for getting random numbers
import java.util.Scanner;	//import the Scanner class to get the input from user

public class RockPaperScissors2 	//Class declaration
{
	static Random random=new Random();	//create the object of the random class
	
	public static void main(String[] args) 	//main method
	{
		boolean exit = true;
		Scanner sc = new Scanner(System.in);	//create the sanner obj
		while (exit) 	//exicute the loop while exit
		{
			System.out.println("*******  OPTIONS  ********"
					+ "\n1.Rock"
					+ "\n2.Paper"
					+ "\n3.Scissors"
					+ "\n4.Exit"
					+ "\n----Select Your Option----");
			switch (sc.nextInt()) 	//swich case with choice
			{
				case 1: 
					System.out.println(selectRandomly().equals("Rock")  ?  " Rock Win  ***"  :  " Sorry Rock !!" );
						//call method selectRandomly() nd chek if it equals Rock then Rock win else sorry Rock		
					break;
	
				case 2:
					System.out.println(selectRandomly().equals("Paper")  ?  " Paper Win  ***"  :  " Sorry Paper !!" );
						//call method selectRandomly() nd chek if it equals paper then paper win else sorry paper		

					break;
	
				case 3:
					System.out.println(selectRandomly().equals("Scissors")  ?  " Scissors Win  ***"  :  " Sorry Scissors !!" );
						//call method selectRandomly() nd chek if it equals Scissors then Scissors win else sorry Scissors		

					break;
				case 4:
					System.out.println("!!! Good Bye !!!");	//exit
					exit = false;
	
					break;
	
				default:System.out.println("Invalid Option");
					break;
			}
		}
	}

	public static String selectRandomly() 	//declare the method with static it returns String
	{
		switch(random.nextInt(4))	//take the randomly no
		{
			case 0: return "Rock";

			case 1: return "Paper";
					
			case 2: return "Scissors";
				
			default:	return "Nothing" ;
		}
	
	}
}
