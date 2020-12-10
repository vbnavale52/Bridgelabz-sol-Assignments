package Assignment;

import java.util.ArrayList;	//import java util pkg for arraylist

public class ListConcatination 	// declaration of the class
{

	public static void main(String[] args) 
	{
		ArrayList arrayList=new ArrayList(); // declaration of the arrayList withaut generic
		arrayList.add('a');	// add the elements into the arrayList
		arrayList.add('b');
		arrayList.add('c');
		
		System.out.println(arrayList);	//print thye arrayList
		
		ArrayList<Integer> arrayList1=new ArrayList<Integer>();	//Declaration of the Arraylist with generic
		arrayList1.add(1);	//add method to add the elements into the arrayList1
		arrayList1.add(2);
		arrayList1.add(3);
		System.out.println(arrayList1);
		
		arrayList.addAll(arrayList1);	//concatination of the arrayList1 into the arrayList
		System.out.println(arrayList);	//display the arrayList after concatination
		
		

	}

}
