package com.chainsys.introduction;

import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class sixth {

	public static void main(String[] args) {
		checkUserName();

	}

	public static void checkUserName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name");
		String userName = sc.next();
		sc.close();
		System.out.println("Name is " + userName);
		char[] nameascharacters = userName.toCharArray();
		int legthofchararray = nameascharacters.length;
		System.out.println("Length of your Name is:" + legthofchararray);

		for (int index = 0; index < legthofchararray; index++) {
			System.out.println(index + ": " + nameascharacters[index]);
		}
	}

	public class CheckAlphabets {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name");
			String userName = sc.nextLine();
			sc.close();
			System.out.println("Name is " + userName);
			char[] nameAsCharacters = userName.toCharArray();
			int lengthofCharArray = nameAsCharacters.length;
			System.out.println("Length of your name is: " + lengthofCharArray);
			if (lengthofCharArray < 8) {
				System.out.println("Name Must have atleast 8 chars");
				return;
			}

			String nameInUppercase = userName.toUpperCase();

			nameInUppercase = nameInUppercase.trim();
			char[] uppercaseCharArray = nameInUppercase.toCharArray();
			lengthofCharArray = uppercaseCharArray.length;
			int asciiValue = 0;
			for (int index = 0; index < lengthofCharArray; index++) {
				asciiValue = (int) uppercaseCharArray[index]; 
				System.out.println("ASCII :" + asciiValue);
				if (asciiValue < 65 || asciiValue > 90) {
					if (asciiValue != 32) {
						System.out.println("IN Valid Character in Name: ");
					}
				}

			}

		}

	}

}
