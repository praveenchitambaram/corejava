package com.chainsys.introduction;

public class Firth {

	public static void main(String[] args) {
		printtaiangleC();

	}

	public static void prinnumberonetohundered() {
		int count = 0;
		for (count = 0; count <= 100; count++) {
			System.out.println(count + "");
		}
	}

	public static void prinnumbertentoone() {
		int count = 10;
		for (count = 10; count >= 1; count++) {
			System.out.println(count + "");
		}

	}

	public static void printmatrix() {
		for (int counta = 1; counta <= 5; counta++) {
			for (int countb = 1; countb <= 5; countb++) {
				System.out.print(countb + " ");
			}
			System.out.println();
		}
	}

	public static void printtaiangle() {
		int counta = 0;
		for (counta = 1; counta <= 5; counta++) {
			for (int countb = 1; countb <= counta; countb++) {
				System.out.print(countb + " ");
			}
			System.out.println();
		}
	}

	public static void printtaiangleA() {
		int counta = 0;
		for (counta = 5; counta >= 1; counta--) {
			for (int countb = 1; countb >= counta; countb--) {
				System.out.print(countb + " ");
			}
			System.out.println();
		}
	}

	public static void printtaiangleB() {
		int counta = 0;
		for (counta = 1; counta <= 5; counta++) {
			for (int countb = 5; countb > counta; countb--) {
				System.out.print(".");
			}
			for (int countc = counta; countc >= 1; countc--) {
				System.out.print(countc);
			}
			System.out.println();
		}

	}

	public static void printtaiangleC() {
		int counta = 0;
		for (counta = 1; counta <= 9; counta++) {

			for (int countb = 10; countb> counta; countb--) {
				System.out.print(".");
			}
			for (int countc = counta; countc >= 1; countc--) {
				System.out.print(countc);
			}
			for (int countd = 2; countd <= counta; countd++) {
				System.out.print(countd);
			}
			System.out.println();
		}
	}
}
