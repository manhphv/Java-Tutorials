package com.codingo.abstractClasses;

public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] people = new Person[2];

		// fill the people array with Student and Employee objects
		people[0] = new Employee("Jack", 20000, 1995, 10, 3);
		people[1] = new Student("Jill", "computer science");

		// print out names and descriptions of all Person objects
		for (Person p : people)
			System.out.println(p.getName() + ", " + p.getDescription());
	}

}