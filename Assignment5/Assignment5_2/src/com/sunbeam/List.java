package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private int count;

	public List() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public  void addFirst(int value) {

		Node newnode = new Node(value);

		if (isEmpty())

			head = newnode;

		else {

			newnode.next = head;

			head = newnode;
		}
	}

	public  void deleteFirst() {

		if (isEmpty())

			System.out.println("List is empty");

		else

			head = head.next;
	}

	public  void displayList() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {

			System.out.print("  " + trav.data);

			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void deleteLast() {
		
		if(isEmpty())
			
			System.out.println("List is empty");
		
		else if(head.next == null)
		
			head = null;
		
		else {
			
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			
			trav.next = null;
		}
	}

	public int getValue() {
		return head.data;
	}

}
