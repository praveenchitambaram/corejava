package com.chainsys.introduction;

import java.util.Scanner;

public class sevanth {

	public static void main(String[] args) {
		// findEvanNumbers();
		swapNumbers();

	}

	public static void findEvanNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit number");
		long value = sc.nextLong();
		sc.close();
		long num = value;
		long reminder = 0;
		while (num > 0) {
			reminder = num % 10;
			if (reminder % 2 == 0) {
				System.out.println(reminder);
			}
			num = num / 10;
		}
	}

	public static void checkUserName() {
	}

	public static void swapNumbers() {
		int x = 67;
		int y = 97;
		System.out.println("X:" + x + "y:" + y);
		x = x + y;
		y = x - y; 
		x = x - y;
		System.out.println("X:" + x + "y:" + y);

	}

  }
