package com.chainsys.introduction;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// taskA();
		// taskB();
		//taskC();
		taskD();

	}

	public static void taskA() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name");
		String name = sc.next();
//		sc.close();
		System.out.println(name);

	}

	public static void taskB() {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("what is your number");
		int number = sc1.nextInt();
		int result = number * 100;
		System.out.println(result);
//		sc1.close();

	}

	public static void taskC() {
		// TODO Auto-generated method stub
		String s1 = "100";
		String s2 = "25";
		System.out.println(s1 + s2);
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		int z = x + y;
		System.out.println(z);

	}

	public static void taskD() {
		// TODO Auto-generated method stub
		Scanner sc3 = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc3.nextInt();
		sc3.close();
		if (age < 0) {
			System.out.println("invalid age!!!");
		}
		if (age < 18) {
			System.out.println("sorry!!-you need to wait to get DL");
		} else {
			System.out.println("happy biking");
		}

	}

}
