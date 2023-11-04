package com.sunbeam;

import java.util.Scanner;

public class Deque {

	static List list;

	Deque() {
		list = new List();
	}

	void push(int data) {
		list.addFirst(data);
	}

	void popFront() {
		list.deleteFirst();
	}

	void popRear() {
		list.deleteLast();
	}

	public static void main(String[] args) {
		int choice;
		Deque de = new Deque();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("*****Input restricted deque******");
			System.out.println("1. Push data from from front");
			System.out.println("2. Pop data from front end ");
			System.out.println("3. Peek data from rear end");
			System.out.println("4. Display queue");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				System.out.print("Enter element to push : ");
				int value = sc.nextInt();
				de.push(value);
				break;

			case 2:
				de.popFront();
				break;

			case 3:
				de.popRear();
				break;

			case 4:
				list.fDisplay();
			}

		} while (choice != 0);

	}
}
