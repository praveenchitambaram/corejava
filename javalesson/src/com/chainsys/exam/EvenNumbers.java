package com.chainsys.exam;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Alphabets.num();

	}

	public static void number() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three diget number ");
		int num = sc.nextInt();
		sc.close();
		int A = num;
		int digit1, digit2, digit3;
		digit3 = A % 10;
		A = A / 10;

		digit2 = A % 10;
		A = A / 10;

		digit1 = A % 10;
		int result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);
		if (num == result) {
			System.out.println(num + "- is Armstrong Number");
		} else {
			System.out.println(num + "-is Not a Amstrong Number: ");
		}

	}

	public static void jerry() {
		String s2 = "Tom and jerry are good friends";
		System.out.println(s2);
		String trimString = s2.trim();
		String data[] = trimString.split(" ");
		int line1 = data.length;
		System.out.println("Number of words in string = " + line1);
		char chararray[] = s2.toCharArray();
		System.out.println("Reversed String is:");
		for (int i = chararray.length - 1; i >= 0; i--) {
			System.out.print(chararray[i]);

		}
	}

	public static void sum() {
		int x = 0;

		for (x = 5; x <= 10; x++) {
			int total = 2 * x * x + x + 5;
			System.out.println(total);
		}

	}

	public static void Temperature() {
		Scanner weather = new Scanner(System.in);
		System.out.println("Enter the temperature or degrees");
		int n = weather.nextInt();

		if (n == 1) {
			System.out.println("its is raining tell tham to bring the umberlla");
		}

		else if (n < 32) {
			System.out.println("bring the heavy jacket ");
		} else if (n >= 32 && n <= 50) {
			System.out.println("bring the light jacket");
		} else {
			System.out.println("dont need the jackets or umberlla");
		}

	}

	public class Alphabets {

		public static void num() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name");
			String name = sc.nextLine();
			sc.close();
			char[] nameAsCharacters = name.toCharArray();
			int lengthofCharArray = nameAsCharacters.length;
			int ref = 0;

			if (lengthofCharArray < 8) {
				System.out.println("Name Must have atleast 8 chars");
			} else {
				String Uppercasename = name.toUpperCase();

				Uppercasename = Uppercasename.trim();
				char[] uppercaseCharArray = Uppercasename.toCharArray();
				lengthofCharArray = uppercaseCharArray.length;
				int asciiValue = 0;
				for (int index = 0; index < lengthofCharArray; index++) {
					asciiValue = (int) uppercaseCharArray[index];

					if (asciiValue < 65 || asciiValue > 90) {
						if (asciiValue != 32) {
							System.out.println("IN Valid Character in Name: ");
							ref++;
							break;
						}
					}

				}
				if (ref == 0) {
					System.out.println("this name is full of alphabet:" + name);
				}
			}

		}

	}
}
