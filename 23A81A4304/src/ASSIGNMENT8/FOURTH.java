
//4. Write a JAVA program to implement hybrid Inheritance using interfaces

package ASSIGNMENT8;

import java.util.*;
interface GrandParents
{
	void Scolds();
}
interface Parents extends GrandParents
{
	void Shouts();
	
}
interface GrandChildren extends Parents
{
	void Mistakes();
	
}
class GreatGrandDaughter implements GrandChildren
{
	@Override
	
	public void Scolds ()
	{
		System.out.println("All GrandParents Scolds.");

	}
	@Override
	
	public void Shouts()
	{
		System.out.println("All Parents Shouts ..");

	}
	@Override
	
	public void Mistakes()
	{
		System.out.println("All GrandChildren makes Mistakes.");
	
	}

}
public class FOURTH
{

	public static void main(String[] args) 
	{
		GreatGrandDaughter obj=new GreatGrandDaughter();
		obj.Scolds();
		obj.Shouts();
		obj.Mistakes();
	}

}
