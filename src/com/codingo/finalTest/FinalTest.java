package com.codingo.finalTest;

public class FinalTest {
	static final int CAPACITY = 4;

	public static void main(String args[]) {
		final int i = 10;
		// Error because i is final.
		// i = 30;
		// Error because CAPACITY is final.
		// CAPACITY = 5;
	}
}
