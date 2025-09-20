//5.Write a Java program to sort an array of integers using the Bubble Sort algorithm and display the sorted array.            

package ASSIGNMENT6;

import java.util.*;

public class FIFTH 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("Enter the elements into the array:\n");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("The result array before sorting is :\n");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("The result array after sorting is :\n");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
