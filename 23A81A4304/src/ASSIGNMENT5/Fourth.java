////Write a JAVA program to implement class mechanism. Create a class,methods and invoke them inside main method.
package ASSIGNMENT5;

import java.util.*;
public class Fourth 
{

		int x;
		float y;
		
		Fourth(int a,float b)
		{
			x=a;
			y=b;
		}
		void display()
		{
			System.out.println(" x = "+x+ " , y = "+y);
		}
		void increment()
		{
			x++;
			y++;
		}

		public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter x value:");
			int x= scanner.nextInt();
			System.out.println("Enter y value:");
			float y=scanner.nextFloat();
			Fourth obj = new Fourth(x,y);
			obj.display();
			obj.increment();
			obj.display();


	}

}



