package com.chainsys.javapracties;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String[] args) {
		ifelselader();
	}
	public static void ifstaement() {
		int a=18;
		if (a>=10) {
			System.out.println("a is greaterthan");
		}
	}
	public static void ifelsestatement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " Is evan");
		} else {
			System.out.println(number + " Is odd");

		}
	}
	public static void ifelselader() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=scanner.nextInt();
	if (number<0) {
		System.out.println("Fail");
		
	} else if(number<=50 && number<=30) {
		System.out.println("good");
	}else {
		System.out.println("invalid");
	}
	}
	

}
