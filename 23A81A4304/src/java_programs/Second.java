package java_programs;

import java.util.*;

public class Second  
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:.......");
		int n=sc.nextInt();
		int i;
		for(i=1;i<n-1;i++)
		{
			int temp=i;
			int count=0;
			while(temp>0)
			{
				temp=temp/10;
				count++;
			}
			temp=i;
			int s=0;
			while(temp>0)
			{
				int rem;
				rem=temp%10;
				s=s+rem*rem*rem;
				temp=temp/10;
			}
			if(s==i)
			{
				System.out.println("The armstrong numbers are " +i);
			}
		}
		sc.close();
	}
}
