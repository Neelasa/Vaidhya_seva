package java_programs;

import java.util.Scanner;

public class fourth4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		String n=sc.next();
		char i,j;
		for(j='A';j<='E';j++)
		{
			for(i='A';i<=j;i++)
			{
				System.out.print(i);
			}
			System.out.println();		
		}
		
	}

}
