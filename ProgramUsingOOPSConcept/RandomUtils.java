package review.day2;

import java.util.Random;

public class RandomUtils 
{
	static Random random=new Random();
	
	
	public static PlaysNumbers selectRandomly() 
	{
		switch(random.nextInt(4))
		{
			case 0: return new Rock("Rock");

			case 1: return new Rock("Paper");
					
			case 2: return new Rock("Scissors");
				
			default:	return new PlaysNumbers("Nothing") ;
		}
	}
}
