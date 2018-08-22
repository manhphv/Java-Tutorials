package com.codingo.statics.data;

class Counter {
	static int count = 0;// will get memory only once and retain its value

	Counter() {
		count++;
		System.out.println(count);
	}
}