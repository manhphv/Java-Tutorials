package com.codingo.statics.block;

import java.util.Random;

class RandomGenerator {
	private static long seed;

	static {
		long t = System.currentTimeMillis() % 100;
		seed = System.currentTimeMillis();
		while (t-- > 0)
			seed = getNextNumber(seed);
		System.out.println("Static block : Seed = " + seed);
	}

	static long getNextNumber(long i) {
		Random random = new Random();
		return random.nextLong();
	}
}