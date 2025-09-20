//Write a program to Print a Multiplication Table Using a Method.

package ASSIGNMENT4;

import java.util.*;

public class sixth 
{
	public static int multi(int n ,int i)
	{
		return (n * i);
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		System.out.println("Enter m value to multiply how many times:");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			System.out.println(n+ "*" +i+ "=" +multi(n, i));
		}
	sc.close();
	}

}
