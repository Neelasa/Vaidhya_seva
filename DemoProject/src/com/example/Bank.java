package com.example;

public class Bank 
{
	static int amt= 2000;//if there is no static before the data type that is called instance and we need to 
	//create the obj for that by the class name and for static/class level variables we no need to create the obj just using class name we can access the value
	public static void main(String args[])
	{
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		b1.amt += 5000;
		System.out.println("The instance value is"+b1.amt);
		System.out.println("The local value is" +b2.amt);
		System.out.println("Class level is "+Bank.amt);
	}

}
