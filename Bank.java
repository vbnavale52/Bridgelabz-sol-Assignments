package com.bankac;

public class Bank {
	private String Customer_Name;
	private int Id;
	private double Balance;
	
				public String getName()
				{

					return Customer_Name;
				}

				public void setName(String Customer_Name)
				{

					this.Customer_Name=Customer_Name;
	
				}
	
				public int getId()
				{
					return Id;
				}

				public void setId(int Id)
				{
					this.Id=Id;
				}
				public double getBalance()
				{
					return Balance;
				}
				
				public void setBalance(double Balance)
				{
					this.Balance=Balance;
				}
				
}

