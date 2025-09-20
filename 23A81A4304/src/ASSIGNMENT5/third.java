//3 Write a JAVA program to implement constructor overloading.

package ASSIGNMENT5;

import java.util.*;

public class third 
{
	int x;
	float y;
	third()
	{
		x=0;
		y=0;
	}

	third(int a)
	{
		x=a;
		y=0;
	}
	third(int a,float b)
	{
		x=a;
		y=b;
	}
	public static void main(String[] args) 
	{
		third obj1=new third();
		third obj2=new third(10);
		third obj3=new third(20,40.5f);
		System.out.println(" obj1 : x= " + obj1.x+" y= "+obj1.y);
		System.out.println(" obj2 : x= " + obj2.x+" y= " +obj2.y);
		System.out.println(" obj3 : x= " + obj3.x+" y= " +obj3.y);
	}
}
