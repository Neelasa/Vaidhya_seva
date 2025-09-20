package ASSIGNMENT4;

import java.util.*;

public class practice 
{
	static int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b value:....");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//practice sc =new practice();
		int sum=add(a,b);
		System.out.println("the sum of "+a+ "and " +b+ " is :" +sum);

	}

}
