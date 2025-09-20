
//2. Write a JAVA program give example for “super” keyword.

package ASSIGNMENT8;

import java.util.*;
class Section
{
	String Gender="Female";
	void displayGender()
	{
		System.out.println("The Gender is:"+Gender);
		
	}
}
class Student extends Section
{
	String Gender="Male";
	
	@Override
	void displayGender()
	{
		System.out.println("The Gender is:"+Gender);
	super.displayGender();
		
	}
	Student()
	{
		super();
		System.out.println("The section has both male and female students.....");
		
	}
	
}

public class SECOND 
{

	public static void main(String[] args) 
	{
		Student sc=new Student();
		sc.displayGender();
		
	}

}
