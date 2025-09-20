//2 Write a JAVA program to implement constructor.

package ASSIGNMENT5;

import java.util.*;
class Rectangle
{
	int length,bredth;
	Rectangle(int len,int bre)
	{
		length=len;
		bredth=bre;
	}
	/*Rectangle(Rectangle obj)
	{
		System.out.println("Copy Constructor invoked ");
		length=obj.length;
		bredth=obj.bredth;
		
	}*/
	int area()
	{
		return(length*bredth);
	}
}

public class second 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("The length of the rectangle is :");
		int length=obj.nextInt();
		
		System.out.println("The breadth of the rectangle is :");
		int bredth=obj.nextInt();
		
		Rectangle r1=new Rectangle(length,bredth);
		Rectangle r2=new Rectangle(5,6);
		System.out.println("area of the rectangle r1 = "+r1.area());
		System.out.println("area of the rectangle r2 =" +r2.area());
	}
}


