//Write a program to Simple Interest Calculation Using a Method.

package ASSIGNMENT4;

import java.util.*;

public class tenth
{
	public static int SI(int p,int t,int r)
	{
		return (p*t*r)/100;		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the principle amount:..");
		int p=sc.nextInt();
		System.err.println("Enter the rate of intrest:....");
		int r=sc.nextInt();
		System.err.println("Enter the time :..");
		int t=sc.nextInt();
		int result=SI(p,t,r);
		System.out.println("the Simple intrest of the given data is:..."+result);
		sc.close();
		
		
	}

}
