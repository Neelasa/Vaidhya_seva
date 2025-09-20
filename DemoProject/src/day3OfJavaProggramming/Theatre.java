package day3OfJavaProggramming;

public abstract class Theatre implements TeluguMovies,EnglishMovies {

	int cost =0;
	int total=0;
	@Override
	public void actor() {
		cost = 300;
		total+=cost;
		System.out.println("The best actor is Nani");
	}

	@Override
	public void director() {
		cost = 300;
		total+=cost;
		System.out.println("The director is nani");
	}

	@Override
	public void actoress() {
		cost = 500;
		total+=cost;
		System.out.println("This represents actress");
	}

	@Override
	public void producer() {
		cost = 500;
		total+=cost;
		System.out.println("This represents producer");
	}
	public void bill()
	{
		System.out.println("The total bill of each is:" +total);
	}

}
