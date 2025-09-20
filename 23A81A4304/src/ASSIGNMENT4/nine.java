//Write a program to Check for Prime Number Using a Method .
package ASSIGNMENT4;

import java.util.*;

public class nine
{
	

	    public static boolean prime(int num)
	    {

	        if (num <= 1) {

	            return false;

	        }

	        for (int i = 2; i < num; i++) 
	        { 

	            if (num % i == 0)
	            {

	                return false;

	            }

	        }

	        return true;

	    }

	    public static void main(String args[]) 
	    {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter any natural number:");

	        int num = sc.nextInt();

	        boolean result = prime(num);

	        if (result)
	        {

	            System.out.println("The given number is a prime.");

	        } 
	        else
	        {

	            System.out.println("The given number is not a prime.");

	        }

	        sc.close();

	    

	}




}
