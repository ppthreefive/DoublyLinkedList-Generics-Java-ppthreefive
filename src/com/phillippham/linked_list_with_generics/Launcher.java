package com.phillippham.linked_list_with_generics;

public class Launcher
{
	public static void main(String[] args)
	{
		// Create a LinkedList data structure
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		// Add some random numbers
		// System.out.println("Adding numbers to the list...");
		for (int i = 0; i < 20; ++i)
		{
			final int MAX = 10;
			final int MIN = 1;
			int num = (int) (Math.random() * (MAX - MIN + 1) + MIN);
			
			// System.out.print(num + " ");
			list.addFront(num);
		}
		
		// Display the LinkedList items
		System.out.println("List of numbers in the LinkedList: ");
		list.display();
		
		// Remove data
		// System.out.println("\nRemove the seven...");
		// list.remove(7);
		
		// Display the data
		list.display();
		
		LinkedList<String> strList = new LinkedList<String>();
		strList.addBack(new String("I got my first real six-string"));
		strList.addBack(new String("Bought it at the five-and-dime"));
		strList.addBack(new String("Played it till my fingers bled"));
		strList.addBack(new String("It was the Summer of '69"));
		strList.addBack(new String("Me and some guys from school"));
		strList.addBack(new String("Had a band and we tried real hard"));
		strList.addBack(new String("Jimmy quit and Jody got married"));
		strList.addBack(new String("I should've known we'd never get far"));
		strList.addBack(new String("Oh when I look back now"));
		strList.addBack(new String("That Summer seemed to last forever"));
		
		System.out.println("\nList of Strings in the LinkedList: ");
		strList.display();
	
		LinkedList<Employee> empList = new LinkedList<Employee>();
		empList.addBack(new Employee("Bob Ross", 20000.00));
		empList.addBack(new Employee("John Doe", 60000.00));
		empList.addBack(new Employee("Jack Jackson", 1200.00));
		empList.addBack(new Employee("Jane Doe", 13000.00));
		empList.addBack(new Employee("Jonathan Jones", 12000.00));
		empList.addBack(new Employee("Scoobert Doobert", 50000.00));
		empList.addBack(new Employee("Donald Duckson", 99950.00));
		empList.addBack(new Employee("Doug Douglas", 85000.00));
		empList.addBack(new Employee("Bobby Robertson", 32000.00));
		empList.addBack(new Employee("Rick James", 99999.99));
		
		System.out.println("\nList of Employees in the LinkedList: ");
		empList.display();
		
		// Exit gracefully
		System.exit(0);
	}
}