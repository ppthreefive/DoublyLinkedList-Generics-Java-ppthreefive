package com.phillippham.linked_list_with_generics;

public class Employee
{
	private String name;
	private double salary;
	
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	// Accessors
	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}
	
	// Mutators
	public void setName(String name)
	{
		this.name = name;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double calculatePay()
	{
		double pay = 0.0;
		
		pay = this.salary / 26;
		
		return pay;
	}

	public String toString()
	{
		return "Employee [Name: " + name + ", Salary: " + salary + ", Biweekly Pay: " + calculatePay() + "]";
	}
}