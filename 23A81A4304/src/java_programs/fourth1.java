package java_programs;

import java.util.Scanner;

public class fourth1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		int n=sc.nextInt();
	     int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=i;j>0;j--)
			{
				System.out.print(i);
			}
			System.out.println();		
		}
		

	}
}
