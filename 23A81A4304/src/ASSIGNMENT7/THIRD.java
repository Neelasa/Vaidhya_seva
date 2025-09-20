//3.Write a Java program that reads a 2D matrix from the user, finds the transpose of the matrix, and displays both the original and the transposed matrices.

package ASSIGNMENT7;

import java.util.*;

public class THIRD
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and column size of the matrix:");
		int rows=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[rows][column];
		System.out.println("Enter the elements into the array:");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The actual matrix is:");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(a[i][j] + " ");
			}
		}
		int b[][] = new int[rows][column];
		//System.out.println("The transpose of the matrix is:");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				 b[i][j]= a[j][i];
			}
		}
		System.out.println("The transpose of the given matrix is as follows :");
		for (int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(b[i][j] + " ");
			}
		}

	}

}
