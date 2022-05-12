package com.chainsys.exam;

import java.util.Scanner;

import com.chainsys.variyables.Calculator;

public class FezzBuzz {
	public static void main(String[] args) {
		testdiVide();

	}

	public static void prinnumberonetohundered() {
		int count = 0;
		for (count = 1; count <= 100; count++) {
			if (count % 3 == 0) {
				System.out.println(count + " " + "Fezz");
			} else if (count % 5 == 0) {
				System.out.println(count + " " + "Buzz");
			} else {
				System.out.println(count);
			}
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println(count + "Fezz Buzz");
			} else {
				System.out.println();
			}

		}
	}

	public static void testdiVide() {
		//Calculator calculator = null;
		int args1 = 100;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the lassthan 100");
		int args2 = scanner.nextInt();
		int result = 0;
		System.out.println("Refore ");
		//calculator = new Calculator();
		result = Calculator.divide(args1, args2);
		System.out.println("Result" + result);
		System.out.println("After");
		scanner.close();
	}

}
