package com.chainsys.variyables;

public class Demo {
	public static int DataA;
	public final int DataB;// immutable
	public final static int DataC = 300;// constand
	private int dataD;

	// constructor
	/*
	 * constructor is a special method the name of the constructor the name of the
	 * class will be same constructors constructors can take parameters
	 * 
	 */
	public Demo(int dataB) {
		this.DataB = dataB;
	}

	public static void sayHello() {
		System.out.println("hello devloper");
	}

	public void greetUser() {
		System.out.println("greetins user!!!");
	}

	public static void testImmutableVariable() {
		/*
		 * cannot make a static reference to the non-static field Demo.DataE
		 * Demoa.DataB=123;
		 */
		/*
		 * frist create an objact for the class pass an int value as an arqument to be
		 * the constructor access the immutable instance field using the object
		 * referance
		 */
		Demo firsiObject = new Demo(123);
		System.out.println(firsiObject.DataB);
	}

}
