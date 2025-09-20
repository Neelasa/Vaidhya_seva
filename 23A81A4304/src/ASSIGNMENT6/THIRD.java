//3.Create a program that finds and prints both the minimum and maximum values in an array.    

package ASSIGNMENT6;

import java.util.*;

public class THIRD
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array :\n");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements into the array:\n");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		
		}		
		System.out.println("The minimum element in the given array is :"+min);
		System.out.println("The maximum element in the given array is :"+max);
	}

}
