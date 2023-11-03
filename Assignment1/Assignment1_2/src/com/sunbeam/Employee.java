package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double salary;

	Employee() {
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter is : ");
		this.id = sc.nextInt();
		System.out.println("Enter name : ");
		this.name = sc.next();
		System.out.println("Enter salary : ");
		this.salary = sc.nextDouble();

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] emp= new Employee[3];

		
		emp[0] = new Employee(1,"e1",1000);
		emp[1] = new Employee(1,"e2",2000);
		emp[2] = new Employee(1,"e3",3000);
		
		System.out.println("Enter id to search : ");
		int id = sc.nextInt();
		
		for(int i = 0;i<emp.length;i++)
		{
			if(id == emp[i].getId())
			{
				System.out.println("**By id**");
				System.out.println("Employee found at index : "+i);
				System.out.println(emp[i]);
				break;
			}
		}
		System.out.println("Enter name to search : ");
		String name  = sc.next();
		
		for(int i = 0;i<emp.length;i++)
		{
			if(name.equals(emp[i].getName()))
			{	
				System.out.println("**By name**");
				System.out.println("Employee found at index : "+i);
				System.out.println(emp[i]);
				break;
			}
		}
		
		System.out.println("Enter salary to search : ");
		Double salary  = sc.nextDouble();
		for(int i = 0;i<emp.length;i++)
		{
			if(salary == emp[i].getSalary())
			{	
				System.out.println("**By salary**");
				System.out.println("Employee found at index : "+i);
				System.out.println(emp[i]);
				break;
			}
		}
		
	}
}

//}

//public static void main(String[] args) 
//{
//	Scanner sc = new Scanner(System.in);
//	Employee[] emp= new Employee[3];
//
////	for (int i = 0; i < emp.length; i++) {
////		emp[i] = new Employee();
////		emp[i].accept();
////	}
////	
////	for (Employee employee : emp) {
////		System.out.println(employee);
////	}
////	System.out.println("Enter id to search : ");
////	int id = sc.nextInt();
//	
////	
//	System.out.println("Enter name to search : ");
//	String  = sc.nextInt();
//	
//	for(int i = 0;i<emp.length;i++)
//	{
//		if(id == emp[i].getId())
//		{
//			System.out.println("Employee found at index : "+i);
//			System.out.println(arr[i]);
//		}
//		
//		if()
//	}
//	
//
	
	

	

//}
//
//}
