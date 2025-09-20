package day3OfJavaProggramming;

public class Customer extends Hotel{

	public void display()
	{
		System.out.println("Customer info:");
	}
	public static void main(String[] args) {

		VegFood vf = new Customer();
				vf.curdRice();
				vf.vegBeriyani();
				System.out.println("-----------------------------------------------------------------");
		NonVegFood nvf = new Customer();
			nvf.chickenbiriyani();
			nvf.muttonBirayani();
			System.out.println("-----------------------------------------------------------------");
			Hotel h=new Customer();

			h.curdRice();

			h.chickenbiriyani();

			h.billDetails();

			System.out.println("---------------------------------------------------");

			Customer c=new Customer();

			c.display();

			c.curdRice();

			c.vegBeriyani();

			c.chickenbiriyani();

			c.muttonBirayani();

			c.billDetails();

			}
			
		
	}


