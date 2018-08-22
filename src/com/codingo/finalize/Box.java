package com.codingo.finalize;

class Box {
	Box() {
		super();
		System.out.println("This object reference is located on the heap at: " + this);
	}

	protected void finalize() { // don't worry about protected yet
		System.out.println("!!!Finalized!!! " + this);
	}
}