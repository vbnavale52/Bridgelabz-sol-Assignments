package Practice;

import java.util.Random;

public class FlipCheck {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		int rno;
		int headCounter=0,tailCounter=0;
		for (int i = 0; i < 22; i++) 
		{
			rno= r.nextInt(2);
			while (headCounter ==11 && tailCounter==11 )
			{
				 	
						if (rno == 0) 
							headCounter++;
						else
							tailCounter++;
						
						
			}
		}
		if(headCounter==11)
			System.out.println(" win with Head "+headCounter+" And Tail point "+tailCounter);
		else if (tailCounter==11) 
			System.out.println(" witn with Tail"+tailCounter+" And Head point "+headCounter);
		else
			System.out.println("Tied");
			
	}

}
