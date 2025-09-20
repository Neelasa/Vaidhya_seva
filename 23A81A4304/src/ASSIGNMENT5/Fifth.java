//5.Write a JAVA program to implement Single Inheritance.

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

public class Fifth 
{
	public static void main(String[] args) 
	{
		Human obj=new Human();
		obj.Hunting();
		obj.sleeping();
		obj.Thinking();
		
		

	}

}
