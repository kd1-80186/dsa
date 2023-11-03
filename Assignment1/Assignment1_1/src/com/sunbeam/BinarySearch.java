package com.sunbeam;

import java.util.Scanner;

public class BinarySearch 
{
	public static int comparisionCount(int arr[], int size, int key)
	{
		int mid,left=0,right=size,count=0;
		
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
			left = mid+1;
		
		else 
			right = mid-1;
		}
		return -1;
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
