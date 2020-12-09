
/* 1.	Finding area and perimeter of rectangle or circle. */

package assignment;
import java.util.Scanner;
public class Rectanglearea {

	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
			System.out.print("\nEnter Length and Breath\t");
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			double Area=l*b;
			double Perimeter=2*(l+b);
			System.out.println("Area="+Area+"\nPerimeter"+Perimeter);


		   sc.close();
	   }
	

}
