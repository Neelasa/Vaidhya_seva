//Write a method that checks whether a given integer is even or odd.
package ASSIGNMENT4;
import java.util.*;
public class third 
{
	public static boolean even(int a)
	{
		return a%2==0;
	}
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=obj.nextInt();
		boolean result=even(a);
		if(result)
		{
			System.out.println("Given number is "+a+" is even");
		}
		else
		{
			System.out.println("Given number is "+a+" is odd");
		}
		
		obj.close();
	}
	

}

