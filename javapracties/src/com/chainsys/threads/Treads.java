package com.chainsys.threads;

class Books {
	void update() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("update");

		}
	}
}

class Number {
	void print() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class Treads {

	public static void main(String[] args) {
		Books book = new Books();
		Number num = new Number();
		book.update();
		num.print();

	}

}
