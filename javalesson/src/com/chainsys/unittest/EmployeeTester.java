package com.chainsys.unittest;

import com.chainsys.classandmethod.Employee;

public class EmployeeTester {
	public static void testemployee() {
		Employee fristemployee = new Employee();
		fristemployee.setName("praveen");
		System.out.println(fristemployee.getName());
	}

	public static void testemployee1() {
		Employee fristemployee = new Employee();
		fristemployee.setCity("chennai");
		System.out.println(fristemployee.getCity());
	}

	public static void testemployee2() {
		Employee fristemployee = new Employee();
		fristemployee.setSalary(10000);
		System.out.println(fristemployee.getsalary());
	}
	 
	 
	

}
