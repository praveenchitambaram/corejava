package com.chainsys.strings;

import java.util.Scanner;

import com.chainsys.introduction.Second;

public class StringLessonA {
	public static void lessonone() {
		String fistString = "chainsys";
		System.out.println(fistString);
		char dataone[] = { 'c', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataone);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'c', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);

	}

	public static void lessonTwo() {
		String firstString = "Hello";
		String secontString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secontNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secontString);
		firstString = "Welcome";
		System.out.println(firstString);
		System.out.println(secontString);

	}

	public static void stringToUpperLower() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("enter a word");
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();
		System.out.println("touppercase" + stringInUppercase);
		// string in firstStrin is not modified,because
		System.out.println("s1" + firstString);
		String stringInLowercase = firstString.toLowerCase();
		System.out.println("lowerCase" + stringInLowercase);
		System.out.println("s1=" + firstString);
		// substring
		// from the 4th char till end
		String substring = firstString.substring(3);
		System.out.println(substring);
		// form 3rd char to 6th char (i.e excluding 7th char)
		// form index 2 to index 5
		substring = firstString.substring(2, 6);
		System.out.println(substring);
		// replace
		String replacedstring = firstString.replace('a', 'c');
	}

	public static void testStringTrim() {
		String secondString = " hope    it   rain     ";
		System.out.println("Befor trim" + secondString.length());
		secondString = secondString.trim();
		System.out.println("After Trim:" + secondString.length());

	}

	public static void testSplit() {
		String frisString = "Tom and Jerry are doog friend ";
		String trimmedString = frisString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("world cound " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	public static void testSplitDays() {
		String weekdays = "mon;tur;wed;thu;fri;sat;sun ";
		String[] data = weekdays.split(" ");
		int count = data.length;
		System.out.println("world cound" + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	public static void reverse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		// String sentence = " ";
		String sentence1 = scanner.nextLine();
		// scanner.close();
		char[] a = sentence1.toCharArray();
		for (int index1 = a.length - 1; index1 >= 0; index1--) {
			System.out.print(a[index1]);
			scanner.close();
		}

	}

	public static void verifyString(String s1) {
		if (null == s1) {
			System.out.println("String is Null");
			return;
		} else {
			System.out.println("String is Not Null" + s1);
		}
		if (!s1.isEmpty()) {
			System.out.println("\t Not Empty"+s1);
			
		}else {
			System.out.println("\t String is Empty");
		}
	}

}
