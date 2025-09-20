//Write a program to find Sum of Digits of a Number Using a Method.

package ASSIGNMENT4;

import java.util.*;

public class eight 
{ 
	public static int digit(int num)
	{
		int sum=0;
		while(num>0)
		{
			int temp;
			temp=num%10;
			sum+=temp;
			num=num/10;
			
		}
		return sum;

	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any natural number:");
		int num=sc.nextInt();
		int result=digit(num);
		
		System.out.println("The sum of the digits of the given number is " +result);
		sc.close();
		
	}



}
