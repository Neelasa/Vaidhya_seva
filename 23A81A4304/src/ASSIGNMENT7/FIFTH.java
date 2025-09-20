//5.Write a Java program to create a jagged array where the number of columns in each row varies. Initialize the array with some values and display the elements in a matrix format.

package ASSIGNMENT7;

public class FIFTH 
{

	public static void main(String[] args) 
	{
		
		        int[][] jaggedArray = new int[3][];
		        jaggedArray[0] = new int[2]; // First row with 2 columns
		        jaggedArray[1] = new int[3]; // Second row with 3 columns
		        jaggedArray[2] = new int[4]; // Third row with 4 columns

		        // Initializing the array with some values
		        int value = 1;
		        for (int i = 0; i < jaggedArray.length; i++) {
		            for (int j = 0; j < jaggedArray[i].length; j++) {
		                jaggedArray[i][j] = value++;
		            }
		        }

		        // Displaying the array elements in matrix format
		        System.out.println("The jagged array elements are:");
		        for (int i = 0; i < jaggedArray.length; i++) {
		            for (int j = 0; j < jaggedArray[i].length; j++) {
		                System.out.print(jaggedArray[i][j] + " ");
		            }
		            System.out.println();
		        }
		
		

		
	}

}
