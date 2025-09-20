//1.Write a Java program to input a 2D array of integers, calculate the sum of all its elements, and display the result.

package ASSIGNMENT7;

import java.util.*;

public class FIRST 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows and columns size of an array:\n");
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int a[][]=new int[rows][columns];
		System.out.println("Enter the elements into the array:\n");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				 sum+= a[i][j];
			}
		}
		System.out.println("The result sum of the array elements is:" + sum);
	}

}
