//5. Write a JAVA program that implements Runtime polymorphism.

package ASSIGNMENT8;

import java.util.*;

class LivingThings
{
	void Breath()
	{
		System.out.println("The living things can breath .");
	}
}
class Plants extends LivingThings
{
	void live()
	{
		System.out.println("The plants are live.");
		
	}
}
class Animals extends LivingThings
{
	void Animals()
	{
		System.out.println("All Animals Are LivingThings.");
	}
	
}
 class FIFTH 
 {
    public static void main(String[] args) 
    {
    	LivingThings obj=new LivingThings();
    	obj.Breath();
    	Plants obj1=new Plants();
    	obj1.live();
    	Animals obj2=new Animals();
    	obj2.Animals();
    	
       
    }
}
