package com.example;

import javax.swing.JOptionPane;

public class exampleofjOptionPanePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = JOptionPane.showInputDialog("Enter your name");
		//JOptionPane.showMessageDialog(null, "Hai" +name+"Welcome to vasavi engineering college");
		//the above are for taking 1 input string and displaying the msg.
		//int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the ni value"));
		//String n2 = JOptionPane.showInputDialog("Enter the n2 value");
		//int b = Integer.parseInt(n2);
		//JOptionPane.showConfirmDialog(null, "The addition of n1 and n2 is" +n1+"and" +n2+"is"+(n1+b));
		//int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the ni value"));
//		if(n1 % 2 != 0)
//		{
//			JOptionPane.showConfirmDialog(null, "The given number is odd");
//		}
//		if(n1 % 2 == 0)
//		{
//			JOptionPane.showConfirmDialog(null, "The given number is even");
//		}
//		int fact =1;
//		for(int i=1;i<=n1;i++)
//		{
//			fact=fact *i;
//			
//		}
//	int sum=0;
//
//		for(int i =1;i<=n1;i++)	{
//			sum+=i;
//			
//		}
//		JOptionPane.showConfirmDialog(null, "The factorial of the given number is"+(sum));// for this the time complexity is O(n
		//JOptionPane.showConfirmDialog(null, "The factorial of the given number is"+(n1 *(n1+1)/2));
		// for the above the t.c is O(1)
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the n1 value"));
		int temp=n1,rev=0,rem=0;
		while(n1 >0)
		{
			
			rem = n1 % 10;
			rev = rev * 10 + rem;
			n1/=10;
			//System.out.println(rev);
			
		}
		//System.out.println(rev);
		if( rev == temp)
		{
			JOptionPane.showConfirmDialog(null, "The given number is a palindrome.");
		}
		else
		{
			JOptionPane.showConfirmDialog(null, "The given number is not a palindrome.");
		}
		
	}

}
