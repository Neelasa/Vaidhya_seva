package java_programs;

import java.util.Scanner;

public class fourth5 
{


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();		
		}
		
	}

}
