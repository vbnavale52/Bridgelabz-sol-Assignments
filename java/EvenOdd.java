/*2.	Check if the given number is even or odd. */

package assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
	
	    if(num%2==0)
	    {
	    	System.out.println("Number is even");
	    }
	    
	    else {
	    	
	    System.out.println("Number Is Odd");
	    }
	    
	    sc.close();
	    
		
	}

}

