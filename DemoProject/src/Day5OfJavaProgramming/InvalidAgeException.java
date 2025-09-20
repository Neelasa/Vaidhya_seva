package Day5OfJavaProgramming;

public class InvalidAgeException extends Exception{

private int age;

InvalidAgeException(int age)

{

this.age=age;

}

@Override

	public String toString() {

		return "InvalidAgeException [age=" + age + "]";
}
}

