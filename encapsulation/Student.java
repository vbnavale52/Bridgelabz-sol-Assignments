package com.encapsulation;

public class Student {

	private int Stud_id;
	private String name;
	private float fees;
	
	
	Student()
	{
	Stud_id=0;
	name=null;
	fees=0.0f;
	}
	
	
	Student(int Stud_id,String name,float fees)
	{
		this.Stud_id=Stud_id;
		this.name=name;
		this.fees=fees;
		
	}

	// Getter Setter
	int getStud_id() {
		return Stud_id;
	}

	void setStud_id(int Stud_id) {
		this.Stud_id = Stud_id;
	}

	 String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;

	}
	
	float getFees()
	{
		return fees;
	}
	
	void setFees(float fees)
	{
		
		this.fees=fees;
	}
	
	
	public  String toString()
	{
		
		return Stud_id +" "+name +" "+fees;
	}
	
	
	
	
	
}

