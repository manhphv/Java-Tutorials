package com.codingo.statics.member;

import java.awt.Color;

class TeaPot {
	private static int numOfTP = 0;
	private Color myColor;

	public TeaPot(Color c) {
		myColor = c;
		numOfTP++;
	}

	public static int howManyTeaPots() {
		return numOfTP;
	}

	// error :
	// public static Color getColor() {
	// return myColor;
	// }
}
