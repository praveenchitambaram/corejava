package com.chainsys.classandmethod;

/**
 * 
 * @author prav3125
 *
 */
public class Car {
	private final String regNo = "876";
	private int yearOfPurchase;
	private String color;
	private String fuer;
	public String getRegNo() {
		return regNo;
	}
	public int getYearOfPurchase() {
		return yearOfPurchase;
	}
	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuer() {
		return fuer;
	}
	public void setFuer(String fuer) {
		this.fuer = fuer;
	}

}
