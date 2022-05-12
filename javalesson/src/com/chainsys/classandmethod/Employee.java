package com.chainsys.classandmethod;

/**
 * this a class that contains employee realated data the person has
 * id,name,city,and salary properties
 * 
 * @author chainsys-praveen created on:25
 * 
 */
public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;

	// constructor
	public Employee(int id) {
		this.empID = id;
	}

	public Employee() {
		this.empID = 0;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getsalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}
