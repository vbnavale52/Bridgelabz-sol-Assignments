package com.bankac;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Bank bb=new Bank();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Customer Name  : ");
		String Customer_Name=sc.next();
		bb.setName(Customer_Name);
		System.out.println("ID :");
		int Id=sc.nextInt();
		bb.setId(Id);
		System.out.println("Balance :");
		double Balance=sc.nextDouble();
		bb.setBalance(Balance);
		System.out.println("Customer_Name :"+ bb.getName() +"       ID :"+ bb.getId()+ "       Balance :"+ bb.getBalance());
	
		sc.close();
	}
	

}
