package com.codingo.interface2;

public class InterfaceTest implements Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		InterfaceTest test1 = new InterfaceTest();
		test1.print();
		test1.show();

		Showable test2 = new InterfaceTest();
		// test2.print();
		test2.show();
	}
}
