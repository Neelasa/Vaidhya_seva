//Write a program to Reverse a String Using a Method 
package ASSIGNMENT4;

import java.util.*;

public class seventh 
{
	public static String reverse(String str)
	{
		String reverse =" ";
		for (int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		return reverse;
		
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any string:");
		String str=sc.nextLine();
		System.out.println("Given string is: " +str);
		String reverse =reverse(str);
		System.out.println("The string after reversed is : "+reverse);
		sc.close();
	}

}
