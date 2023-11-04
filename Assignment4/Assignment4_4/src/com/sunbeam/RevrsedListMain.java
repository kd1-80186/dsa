package com.sunbeam;

public class RevrsedListMain {

	public static void main(String[] args) {
		RevrsedList l1 = new RevrsedList();
		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(4);
		l1.addNode(5);
		
		System.out.println("Original List :");
		l1.display();
		
		l1.reverseList();
		System.out.println("Reversed List :");
		l1.display();
	}

}