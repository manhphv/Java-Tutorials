package com.codingo.statics.member;

import java.awt.Color;

public class TeaPotTest {
	public static void main(String[] args) {
		TeaPot tp1 = new TeaPot(Color.RED);
		TeaPot tp2 = new TeaPot(Color.GREEN);
		System.out.println("We have " + TeaPot.howManyTeaPots() + " Tea Pots");
	}
}
