package com.codingo.abstractClasses;

public class Student extends Person {
	private String major;

	public Student(String name, String major) {
		super(name); // pass n to superclass constructor
		this.major = major;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see abstractClasses.Person#getDescription()
	 */
	@Override
	public String getDescription() {
		return "a student majoring in " + major;
	}

}