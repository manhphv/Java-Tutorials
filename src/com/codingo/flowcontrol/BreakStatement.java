package com.codingo.flowcontrol;

import java.util.Random;

public class BreakStatement {
	public static void main(String[] args) {

		Random random = new Random();

		while (true) {
			int num = random.nextInt(30);
			System.out.print(num + " ");
			if (num == 22) {
				break;
			}
		}
		System.out.print('\n');
	}
}
