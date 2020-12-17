package com.encapsulation;

public class TesterStudent {

	public static void main(String[] args) {
		// getter Setter Method 
		Student obj = new Student();
		obj.setStud_id(10);
		obj.setName("Rohit");
		obj.setFees(20000.56f);
		System.out.println(obj.getStud_id());
		System.out.println(obj.getName());
		System.out.println(obj.getFees());

		
		//default Constructor
		
		Student obj1 = new Student();
		System.out.println(obj1.getStud_id());
		System.out.println(obj1.getName());
		System.out.println(obj1.getFees());
		
		//parameteerized Constructor

		Student obj2 = new Student(11, "Samadhan", 1500.00f);
		System.out.println(obj2.getStud_id());
		System.out.println(obj2.getName());
		System.out.println(obj2.getFees());
		
		//using To String
		
		Student obj3 = new Student(12, "Achal", 1500.00f);
		System.out.println(obj3.toString());
	}

}
