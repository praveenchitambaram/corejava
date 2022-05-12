package com.chainsys.introduction;

public class Star {
	public static void main(String[] args) {
		tasA();
	}

	public static void tasA() {
		int a = 0;
		for(a=1;a<=5;a++) {
			for(int b=5;b>a;b--) {
				System.out.print(" ");
			}
			for(int c=a;c>=1;c--) {
				System.out.print(c);
			}
			for(int d=2;d<=a;d++) {
				System.out.print(d);
			}
			System.out.println();
		}
		for (a = 4; a >= 1; a--) {
			for (int b = 4; b >= a; b--) {
				System.out.print(" ");
			}
			for (int c = a; c >= 1; c--) {
				System.out.print(c);
			}
			for (int d = 2; d <= a; d++) {
				System.out.print(d);
			}
			System.out.println();
		}

	}
}
