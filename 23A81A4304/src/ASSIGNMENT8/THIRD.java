// Write a JAVA program to implement multiple Inheritance Using interfaces. 

package ASSIGNMENT8;

class Animal
{
	void Sound()
	{
		System.out.println("All animals makes sounds.");
	}
}
class Dog extends Animal
{
	void Bark()
	{
		System.out.println("All dogs braks..");
		
	}
}
class Puppy extends Dog
{
	void Sleeping()
	{
		System.out.println("All puppies cries.");
	}
}
public class THIRD
{

	public static void main(String[] args) 
	{
		Puppy obj=new Puppy();
		obj.Sleeping();
		obj.Bark();
		obj.Sound();
	}

}
