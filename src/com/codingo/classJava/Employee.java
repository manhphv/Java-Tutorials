package com.codingo.classJava;

public class Employee {

	String name;
	int age;
	String designation;
	double salary;

	// This is the constructor of the class Employee
	public Employee(String name) {
		this.name = name;
	}

	// overloading construct
	public Employee(String name, int age) {
		//this variable
		this.name = name;
		this.age = age;
	}

	// overloading construct
	public Employee(String name, int age, String designation) {
		this.name = name;
		this.age = age;
		this.designation = designation;
	}

	// Assign the age of the Employee to the variable age.
	public void setAge(int empAge) {
		age = empAge;
	}

	/* Assign the designation to the variable designation. */
	public void setDesignation(String empDesig) {
		designation = empDesig;
	}

	/* Assign the salary to the variable salary. */
	public void setSalary(double empSalary) {
		salary = empSalary;
	}

	/* Print the Employee details */
	public void printEmployee() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
	}
}