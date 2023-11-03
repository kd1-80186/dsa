package com.sunbeam;

import java.util.Scanner;

public class DecendingSearch {
	public static int comparisionCount(int arr[], int size, int key)
	{
		int mid,left=0,right=size-1,count=0;
		
		while(left<=right)
		{
			mid = (left+right)/2;
			count++;
		if(arr[mid] == key)
		{
			System.out.println("Key found at index : "+mid);
			return count;
		}
		
		else if(key>arr[mid])
			right = mid-1;
			
		
		else 
			left = mid+1;
		}
		return -1;
	}		

	public static void main(String[] args) 
	{
		int arr[] = {50,40,30,20,10};
		System.out.println("Enter key to search : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int count = comparisionCount(arr, arr.length, key);
		System.out.println("Number of comparisions : "+count);

	}

}
