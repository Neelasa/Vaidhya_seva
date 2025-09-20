package java_programs;
import java.util.*;
public class Assignment 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		int n=sc.nextInt();
		int j,i;
		
		for(j=1;j<=n;j++)
		{
			int count=0;
		for(i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.print(j+" ,");
			}
		}
		
		sc.close();
	}

}
