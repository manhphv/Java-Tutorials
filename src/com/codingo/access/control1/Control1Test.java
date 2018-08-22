package com.codingo.access.control1;

import com.codingo.access.control2.Control2PublicClass;

public class Control1Test {
	public static void main(String[] args) {
		// Construct new instance of default class in the same package
		Control1DefaultClass class1 = new Control1DefaultClass();
		// call default field and method without error
		int var1 = class1.defaultField;
		class1.defaultMethod();
		// call protected field and protected method without error
		int var2 = class1.protectedField;
		class1.protectedMethod();
		// call private field and private method error, open comment to see
		// int var3 = class1.privateField;
		// class1.privateMethod();

		// Construct new instance of public class in the same package
		Control1PublicClass class2 = new Control1PublicClass();
		// call default field and method without error
		var1 = class2.defaultField;
		class1.defaultMethod();
		// call protected field and protected method without error
		var2 = class2.protectedField;
		class1.protectedMethod();
		// call private field and private method error, open comment to see
		// int var3 = class2.privateField;
		// class2.privateMethod();

		// Construct new instance of default class in the other package => error
		// Control2DefaultClass class3 = new Control2DefaultClass();

		// Construct new instance of public class in the other package => error
		Control2PublicClass class4 = new Control2PublicClass();
		// call default field => error
		// class4.defaultField;
		// call default method => error
		// class4.defaultMethod;
		// call public method => ok
		var2 = class4.publicField;
		class4.publicMethod();
	}
}
