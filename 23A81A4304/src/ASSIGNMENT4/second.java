//Write methods for addition, subtraction, multiplication, and division. Use these methods in a simple calculator program. 
package ASSIGNMENT4;

import java.util.Scanner;

public class second 
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}public static int pro(int a,int b)
	{
		return a*b;
	}

	public static double div (int a,int b)
	{
		if(b!=0)
		{
			return (double)a/b;

		}
		else
		{
			System.out.println("Invallid input because if dinomator is zero the ans will be not defined......");
			return 0;
		}
	}	
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a and b values :");
		int a=obj.nextInt();
		int b=obj.nextInt();
		System.out.print("Enter your choice +,-,*,/,.......");
		char ch=obj.next().charAt(0);
		double result;
		switch(ch)
		{
		case '+':
			result=add(a,b);
			System.out.println("The result is :" +result);
			break;
		case '-':
			result=sub(a,b);
			System.out.println("The result is :" +result);
			break;
		case '*':
			result=pro(a,b);
			System.out.println("The result is :" +result);
			break;
		case '/':
			result=div(a,b);
			System.out.println("The result is :" +result);
			break;
		
		default:
			System.out.println("Invallid input");	
		}
		obj.close();
	}
}
