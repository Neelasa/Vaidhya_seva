package Day5OfJavaProgramming;

import java.util.Scanner;

public class Demo {
/*
	public static void div(int x, int y) 
	{
		
		try
		{
			System.out.println("Division of"+x+"/"+y+"is :"+(x/y));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Byee...........");
		}

	}
	public static void main(String[] args)throws ArithmeticException 
	{
		System.out.println("welcome to Division program");
		Demo.div(22, 0);
		System.out.println("Byee...........");
	}
	*/
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your age");

		int a=sc.nextInt();

		if(a<18)

		{

		try

		 {

		 throw new InvalidAgeException(a);

		}

		catch(InvalidAgeException iae)

		{

		System.out.println(iae);

		}

		}

		else

			{

		 System.out.println("Valid Age "+a);

		}

		}

		}


