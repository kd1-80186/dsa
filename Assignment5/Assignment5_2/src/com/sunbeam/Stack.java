package com.sunbeam;

import java.util.Scanner;

public class Stack {
	static List list;

	Stack() {
		list = new List();
	}
	
	public void push(int data)
	{
		list.addFirst(data);
	}
	
	public int pop()
	{	
		list.deleteFirst();
		return list.getValue();
	}
	
	
	public int peek()
	{
		return list.getValue();
	}
	
	public void display()
	{
		list.displayList();
	}


	public static void main(String[] args) {
		int choice;
		Stack st = new Stack();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Push data");
			System.out.println("2. Pop data");
			System.out.println("3. Peek data");
			System.out.println("4. Display stack");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				System.out.print("Enter element to push : ");
				int value = sc.nextInt();
				st.push(value);
				break;

			case 2:
				System.out.print("Popped element : " + st.peek()+"\n");
				st.pop();
				break;

			case 3:
				System.out.println("Peeked element : "+st.peek()+"\n");
				break;
				
			case 4: 
					list.displayList();
			}

		} while (choice != 0);

	}
}
