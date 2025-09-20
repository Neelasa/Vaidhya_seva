//2.Write a program to count and display the number of even and odd integers in a given array.

package ASSIGNMENT6;

import java.util.*;

public class SECOND 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :\n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements into the array : \n");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("The Given elements into the array are as follows:\n");
		for (int i=0;i<a.length;i++)
		{
			System.out.println("a[i]= " +a[i]);
			
		}
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i] %2==0)
			{
				count++;
			}
		}
		System.out.println("The No:of even numbers in the given array of " +a.length+"elements is as follows :"+count);
		int count1=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i] %2 !=0)
			{
				count1++;
			}
		}
		System.out.println("The No:of odd numbers in the given array of " +a.length+"elements is as follows :"+count1);

	}

}
