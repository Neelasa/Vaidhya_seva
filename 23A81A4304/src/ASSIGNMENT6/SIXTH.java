//6.Write a program to Implement a binary search algorithm to find a target value in a sorted array.

package ASSIGNMENT6;

import java.util.*;

public class SIXTH 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int a[] =new int[size];
		System.out.println("Enter the elements into the array:\n");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element to search:\n");
		int ele=sc.nextInt();
		///////////////////////////////////////////////////////////////
		//Arrays.sort(a);
		
		int result = binarySearch(a, ele);
		
        if (result == -1) 
	        {
	            System.out.println("The element is not found");
	        } 
        else 
	        {
	            System.out.println("The element is found at index: " + result);
	        }
    }

     static int binarySearch(int[] a, int ele) 
    {
        int low = 0;
        int high = a.length - 1;
        
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            
            if (a[mid] == ele) 
	            {
	                return mid;
	            }
            if (a[mid] < ele)
	            {
	                low = mid + 1;
	            } 
            else 
            {
                high = mid - 1;
            }
        }
        return -1; // Element not found
		
	}

}
