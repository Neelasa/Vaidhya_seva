//Write a method that takes two integers as parameters and returns their sum.
package ASSIGNMENT4;

import java.util.*;

public class first
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=add(a,b);
		System.out.println("The sum of " +a+ "and " +b+ "is :" +sum);
		sc.close();
	}

}
