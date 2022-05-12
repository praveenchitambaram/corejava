package com.chainsys.interfaces;

public class Calculator implements InterfaceCalculator {

	public int add(int value1, int value2) {
		System.out.println(value1 + value2);
		return value1 + value2;
	}

	public int multiply(int value1, int value2) {
		System.out.println(value1 * value2);
		return value1 * value2;

	}

	public int divide(int value1, int value2) {
		System.out.println(value1 / value2);
		return value1 / value2;
	}
}
