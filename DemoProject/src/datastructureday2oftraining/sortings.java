package datastructureday2oftraining;

import java.util.Scanner;
public class sortings
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:of elements in array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements in the array before sorting is as follows :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		int temp=0;
		int len = arr.length;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=0;j<len-1;j++)
//			{
//				if(arr[j] > arr[j+1])
//				{
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//				
//			}
//			System.out.println();
//		}
//		
//		System.out.println("The elements in the array after sorting is as follows :");
//		for(int i=0;i<len;i++)
//		{
//			System.out.println(arr[i]+"\t");
//			
//		}
		///selection sort
		// Selection Sort - Ascending Order
		
//		for (int i = 0; i < len - 1; i++) {
//		    int minIndex = i;
//		    for (int j = i + 1; j < len; j++) {
//		        if (arr[j] < arr[minIndex]) {
//		            minIndex = j;
//		        }
//		    }
//		    
//		     temp = arr[i];
//		    arr[i] = arr[minIndex];
//		    arr[minIndex] = temp;
//		}
//
//		System.out.println("The elements in the array after sorting are:");
//		for (int i = 0; i < len; i++) {
//		    System.out.print(arr[i] + "\t");
//		}
		
		//Insertion sort
		for(int i=0;i<len;i++)
		{
			
		}
	}

}
