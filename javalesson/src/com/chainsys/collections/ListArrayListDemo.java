package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayListDemo {
	public static void main(String[] args) {
		lessonArraylist();
	}

	public static void lessonArraylist() {
		ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
		System.out.println("initiemparraylist size of empArrayList:" + empArrayList.size());
		try {
			for (int i = 0; i < 5; i++) {
				Emp e1 = new Emp(i);
				e1.Name = "Emp" + i;
				empArrayList.add(e1);
			}
			System.out.println("size of empArrayList after additions" + empArrayList.size());
			Emp e3 = (Emp) empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("size of empArrayList after additions" + empArrayList.size());

			empArrayList.add(new Emp(4));
			System.out.println("Freg of [emp id-4]in ArrayList-" + Collections.frequency(empArrayList, e3));
			Iterator<Emp> empItrator = empArrayList.iterator();
			while (empItrator.hasNext()) {
				Object element = empItrator.next();
				Emp e1 = (Emp) element;
				System.out.println("\t" + e1.getid() + " " + e1.Name);
			}
		} catch (Exception err) {
			System.out.println("ERROR!!!!" + err.getMessage());

		}
	}
}
