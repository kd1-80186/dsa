package com.sunbeam;

import java.util.Scanner;

public class LinearSearch 
{
		public static int comparisionCount(int arr[], int size, int key)
		{
			int count = 0;
			for(int i =0;i<size;i++)
			{
				count++;
				if(arr[i] == key)
				{
					System.out.println("Key found at index : "+i);
					break;//count = i+1;
				}
				//return count;
			}
			return count;		
	}

	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40,50};
		System.out.println("Enter key to search : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int count = comparisionCount(arr, arr.length, key);
		System.out.println("Number of comparisions : "+count);
		

	}

}
