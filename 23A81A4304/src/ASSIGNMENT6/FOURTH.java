//4.Develop a program that asks the user for a number and searches for it in a predefined array. Print whether the number was found.

package ASSIGNMENT6;

import java.util.*;

public class FOURTH 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:\n");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements into the array :\n");

		for(int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search:\n");
		int ele=sc.nextInt();
		boolean found =false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				found=true;
				break;
			}
			
		}
		if(found==true)
		{
			System.out.println("The number is found\n");
		}
		else
		{
			System.out.println("The number is not found\\n");
		}
	}

}
