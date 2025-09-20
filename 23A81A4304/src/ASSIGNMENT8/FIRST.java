// Write a JAVA program for abstract class to find areas of different shapes. 

package ASSIGNMENT8;

import java .util.*;

abstract class Shapes
{
	abstract double area();
	
}
class Circle extends Shapes
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	
	double area()
	{
		return 3.147*radius*radius;
	}
}
class Rectangle extends Shapes
{
	double length,breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	@Override
	double area()
	{
		return length*breadth;
	}
}

public class FIRST 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius for the circle:");
		double radius=sc.nextDouble();
		System.out.println("Enter the length and breadth for the rectangle:");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Shapes obj=new Circle(radius);
		Shapes obj1=new Rectangle(length,breadth);
		System.out.println("Area of circle is :"+obj.area());
		System.out.println("Area of the rectangle is:"+obj1.area());
		
	}

}
