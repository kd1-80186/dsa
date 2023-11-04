package com.sunbeam;

public class InsertListMain {

	public static void main(String[] args) {
		InsertList insert=new InsertList();
		insert.inertSorted(80);
		insert.inertSorted(70);
		insert.inertSorted(60);
		insert.inertSorted(50);
		insert.inertSorted(10);
		insert.inertSorted(30);
		insert.inertSorted(20);
		insert.inertSorted(40);
		
		System.out.println("Inserted list :");
		insert.display();

	}

}
