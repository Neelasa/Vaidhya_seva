package day3OfJavaProggramming;


public class SBIBank implements Lone{

	@Override
	public void interestRate(int amount) {
		System.out.println("The rate of interest is"+amount);
	}
	
	public class customer1 extends SBIBank
	{
		
	}

	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.interestRate(3);
		
		
		
	}
}


