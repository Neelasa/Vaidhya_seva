//6 Write a JAVA program to implement multi level Inheritance.

package ASSIGNMENT5;

import java.util.*;

class Animal
{
	void Hunting()
	{
		System.out.println("Hunting........");
	}
	void sleeping()
	{
		System.out.println("Sleeping..........");
	}
}
class Human extends Animal
{
	void Thinking()
	{
		System.out.println("Thinking..........");
	}
}
class Monkey extends Human
{
	void Crying()
	{
		System.out.println("Crying............");
	}
}

public class Sixth 
{
	public static void main(String[] args) 
	{
		Monkey obj=new Monkey();
		obj.Hunting();
		obj.sleeping();
		obj.Thinking();
		obj.Crying();
		
		
	}

}
