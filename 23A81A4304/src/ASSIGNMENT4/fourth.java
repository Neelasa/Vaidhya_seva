//Find the Largest of Three Numbers Using a Method .
package ASSIGNMENT4;

import java.util.*;

public class fourth 
{
	public static int greatest(int a,int b,int c)
	{
		if((a>b) && (a>c))
		{
			return a;
		}
		else if(b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
		
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a value:");
		int a=obj.nextInt();
		System.out.print("Enter b value:");
		int b=obj.nextInt();
		System.out.print("Enter c value:");
		int c=obj.nextInt();
		int result=greatest(a,b,c);
		System.out.println("The greatest number among these three is:"+result);
	}

}
