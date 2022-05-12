package com.chainsys.unittest;

import com.chainsys.variyables.Calculator;

public class CalculaterTest {
	/**
	 * calling non-static method using object reference without creating an
	 * object,non static method cannot be called created on : march 25 2022
	 */
	public static void testAddMethod() {
		Calculator.add(26, 30);
		System.out.println("the add value is :" + Calculator.add(26, 30));
		
		Calculator.divide(12, 34);
		System.out.println("the divide value is :" + Calculator.divide(12, 34));
		
		Calculator.multiply(12, 34);
		System.out.println("the multiply value is :" + Calculator.multiply(12, 34));
		
		Calculator.subtract(12, 34);
		System.out.println("the subtract value is :" + Calculator.subtract(12, 34));



	}
}
