package com.sunbeam;

import java.util.Scanner;

public class Queue {
	static List list;
	
	Queue()
	{
		list = new List();
	}
	
	 public void push(int data)
	{
		list.addFirst(data);
	}
	
	public void pop()
	{
		list.deleteLast();
	}
	
	public int peek()
	{
		return list.getValue();
	}

	public static void main(String[] args) 
	{
		int choice;
		Queue qu = new Queue();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Push data");
			System.out.println("2. Pop data");
			System.out.println("3. Display stack");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				System.out.print("Enter element to push : ");
				int value = sc.nextInt();
				qu.push(value);
				break;

			case 2:
				qu.pop();
				break;
				
			case 3: 
					list.displayList();
			}

		} while (choice != 0);

	}
		
	}

