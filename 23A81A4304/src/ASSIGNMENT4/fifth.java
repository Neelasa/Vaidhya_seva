//Calculate the Area of a Circle Using a Method .

package ASSIGNMENT4;

import java.util.*;

public class fifth 
{
	public static double area(double r)
	{
		return 3.147*r*r;

	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the radius of a circle:");
		double r=sc.nextDouble();
		double fifth= area ( r);
		System.out.println("The area of the circle for given radius is"+fifth);
		sc.close();
	}

}
