package java_programs;

import java.util.Scanner;

public class fourth2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		String n=sc.next();
		char i,j;
		for(i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();		
		}
			
		}
		
	}


