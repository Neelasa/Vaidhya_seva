package day3OfJavaProggramming;

public class Bankingexample {

	
		int amount = 2000;
		void withdraw(int amount)
		{
			if(this.amount >= amount)
			{
				System.out.println(amount+" Withdraw successfully");
				this.amount -= amount;
			}
			else
			{
				System.out.println("Insufficient account balance");
			}
		}
		void deposit(int currency)
		{
			this.amount+=currency;
			System.out.println("The money diposited is"+currency);
		}
		
		void balance()
		{
			System.out.println("Account balance is"+amount);
		}
		public static void main(String[] args) 
		{
			Bankingexample be = new Bankingexample();
			be.balance();
			be.withdraw(500);
			be.balance();
			be.deposit(1000);
			be.balance();
	}

}
