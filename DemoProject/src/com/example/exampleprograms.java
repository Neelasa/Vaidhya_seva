package com.example;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;//it is used to handel the try-catch exception error 
import java.io.DataInputStream;
import java.util.*
;
public class exampleprograms 
{
	public static void main(String args[])
{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int a = sc.nextInt();
//		int count =0;
//		for(int i=1;i<=a;i++)
//		{
//			if(a % i == 0)
//			{
//				count ++;
//			}
//		}
//		if(count == 2)
//		{
//			System.out.println("prime number");
//		}
//		else
//		{
//			System.out.println("not a prime");
//		}
//		}
		/// example for BufferedReader
//	public static void main(String[] args) throws IOException
//	{
////		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		System.out.println("Enter your name:");
////		String name = br.readLine();
////		System.out.println("Hai "+name+" welcome to vasai college");
//		
//		DataInputStream dis = new DataInputStream(System.in);
//		System.out.println("Enter your name:");
//		String name = dis.readLine();// the readLine is a depricated method because it is used in old version and now it is ignored so it is sutomatically strickitout
//		System.out.println("Hai " +name+" Welcome to vasavi engineering coolege");

		//program for fibonacci series to print n numbers
		
		
//		Scanner sc = new Scanner(System.in);
//		int a=0,b=1;
//		int c = 0;
//		System.out.println("Enter the n value:");
//		int n = sc.nextInt();
//		for(int i =0;i<=n;i++)
//		{
//			c = a+b;
//			System.out.println(c);
//			a = b;
//			b= c;
//		}
		
		// swapping 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the a value:");
//		int a = sc.nextInt();
//		System.out.println("Enter the b value:");
//		int b = sc.nextInt();
//		System.out.println("Before swapping the value of a and b is "+ a +","+b);
//		// int temp=0;
//		//temp=a;
//		//a=b;
////		b=temp;
////		a= a+b;
////		b = a-b;
////		a=a-b;
//		a = a^b;
//		b=b^a;
//		a=a^b;
//				
//		System.out.println("After swapping the value s of a and b is "+ a +","+b);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value to convert decimal to binary:");
//		int n = sc.nextInt();
//		int rem=0;
//		String bin="";
//		while(n>0)
//		{
//			rem = n % 2;
//			bin = rem+bin;
//			n=n/2;				
//		}
//		System.out.println("The binary value is"+bin);
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value to convert binary to decimal:");
//		int n = sc.nextInt();
//		int rem=0,dec=0;
//		double  res =0;
//		while(n >0)
//		{
//			rem = n % 2;
//			res =  res + rem*Math.pow(2, dec);
//			dec++;
//			n = n/10;
//			
//		}
//		
//		System.out.println("the decimal value of this is "+res);
		System.out.println("Enter the value to convert octal to binary :");
		int n = sc.nextInt();		
		int rem=0,bin=0;
		double  res =0;
		while(n >0)
		{
			rem = n % 8;
			res =  res + rem*Math.pow(8, bin);
			bin++;
			n = n/8;
			
		}
		
		System.out.println("the decimal value of this is "+res);
		
		
}
}

