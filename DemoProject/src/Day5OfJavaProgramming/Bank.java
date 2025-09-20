package Day5OfJavaProgramming;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount in your bank:");
		long amt = sc.nextLong();
		System.out.println("The total amount in your bank is"+amt);
		System.out.println("Enter the amount to withdraw from your account:");
		double wd = sc.nextDouble();
		System.out.println("The amount rremaining after withdrawing is:"+wd);
		if(amt < wd)
		{
			try
			{
				throw new InvalidWithDrawException(amt);
			}
			catch(InvalidWithDrawException bk )
			{
				System.out.println(bk);
			}
			finally
			{
				System.out.println("Thank form Union Bank:");
			}
		}
		else
		{
			System.out.println("The remaining amount in your account is:"+(amt - wd));
		}
		

	}

}
