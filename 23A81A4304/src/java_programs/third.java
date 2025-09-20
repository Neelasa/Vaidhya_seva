package java_programs;

import java.util.Scanner;

public class third
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		int n=sc.nextInt();
		System.out.println("Enter the lower limit upto which the table should be");
		int L=sc.nextInt();
		for(int i=1;i<=L;i++)
		{
			System.out.println(n+"x"+i+"="+(n*i) );
			
		}

	}	
}
