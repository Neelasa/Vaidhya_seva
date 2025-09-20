package day3OfJavaProggramming;

public class Driver extends Car
{

	@Override
	public void start() {
		System.out.println("Used to start a car");

		
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Used to increase speed");

		
	}

	@Override
	public void stop() {
		System.out.println("Used to stop a car");

		
	}
	public static void main(String[] args) {

		Driver d=new Driver();

		d.brandNew();

		d.color();

		d.start();

		d.increaseSpeed();

		d.stop();

		}



		}


