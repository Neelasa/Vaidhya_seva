//4.Write a Java program to declare, initialize, and display a 3D array of size 2x3x4. The program should fill the array with random numbers and then print all the elements.

package ASSIGNMENT7;

import java.util.Random;

public class FOURTH 
{

	public static void main(String[] args)
	{
		int a [][][]= new int[2][3][4];
		Random sc =new Random();
		System.out.println("Fill the array with random numbers/elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					a[i][j][k]=sc.nextInt(100);
				}
			}
		}
		System.out.println("Display the array elements:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.println(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
