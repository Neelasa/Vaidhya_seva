package day3OfJavaProggramming;

public  class CustomerBooking extends Theatre{

	public void display()
	{
		System.out.println("Customer information:");
	}
	
	public static void main(String[] args) {
		TeluguMovies tm = new CustomerBooking();
		tm.actor();
		tm.director();
		System.out.println("-----------------------------------------------------------------");
		EnglishMovies em = new CustomerBooking();
		em.actoress();
		em.producer();
		System.out.println("-----------------------------------------------------------------");
		Theatre t = new CustomerBooking();
		t.actor();
		t.director();
		t.bill();
		System.out.println("-----------------------------------------------------------------");
		CustomerBooking cb = new CustomerBooking();
		cb.display();
		cb.actor();
		cb.director();
		cb.actoress();
		cb.producer();
		cb.bill();
		
	}

}
