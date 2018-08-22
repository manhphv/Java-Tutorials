package com.codingo.flowcontrol;

import java.util.Scanner;

public class MultipleBranches {
	public static void main(String[] args) {

		System.out.print("Enter an integer:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("The integer is negative");
		} else if (num == 0) {
			System.out.println("The integer equals to zero");
		} else {
			System.out.println("The integer is positive");
		}
	}
}
