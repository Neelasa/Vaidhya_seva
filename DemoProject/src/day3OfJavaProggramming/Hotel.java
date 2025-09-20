package day3OfJavaProggramming;


 public abstract class Hotel implements VegFood,NonVegFood {
	 int cost =0,total=0;
	
	@Override
	public void chickenbiriyani() {
		cost = 200;
		total+=cost;
		System.out.println("Chicken Biriyani");
	}

	@Override
	public void muttonBirayani() {
		cost= 500;
		total+=cost;
		System.out.println("Mutton Biriyani");
	}

	@Override
	public void curdRice() {
		cost= 100;
		total+=cost;
		System.out.println("CurdRice");
	}

	@Override
	public void vegBeriyani() {
		cost = 130;
		total+=cost;
		System.out.println("Veg Birriyani");
	}

	public void billDetails() {
		// TODO Auto-generated method stub
		System.out.println("total cost of the food is"+total);
	}
	
}
