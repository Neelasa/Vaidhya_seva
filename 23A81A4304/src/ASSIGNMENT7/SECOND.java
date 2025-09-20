//2.Write a Java program to input two 2D arrays (matrices) and perform matrix multiplication. Ensure that the number of columns in the first matrix matches the number of rows in the second matrix. Display the resulting matrix.

package ASSIGNMENT7;

import java.util.*;

public class SECOND
{

		    public static void main(String[] args) 
		    {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the number of rows and columns for matrix A:");
		        int rowsA = sc.nextInt();
		        int colsA = sc.nextInt();
		        
		        int[][] a = new int[rowsA][colsA];
		        System.out.println("Enter the elements into matrix A:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsA; j++) {
		                a[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("Enter the number of rows and columns for matrix B:");
		        int rowsB = sc.nextInt();
		        int colsB = sc.nextInt();

		        if (colsA != rowsB) {
		            System.out.println("Matrix multiplication is not possible with these dimensions.");
		            return;
		        }

		        int[][] b = new int[rowsB][colsB];
		        System.out.println("Enter the elements into matrix B:");
		        for (int i = 0; i < rowsB; i++) {
		            for (int j = 0; j < colsB; j++) {
		                b[i][j] = sc.nextInt();
		            }
		        }

		        int[][] c = new int[rowsA][colsB];
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                for (int k = 0; k < colsA; k++) {
		                    c[i][j] += a[i][k] * b[k][j];
		                }
		            }
		        }

		        System.out.println("The result matrix is:");
		        for (int i = 0; i < rowsA; i++)
		        {
		            for (int j = 0; j < colsB; j++)
		            {
		                System.out.print(c[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}
