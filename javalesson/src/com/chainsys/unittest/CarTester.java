package com.chainsys.unittest;

import com.chainsys.classandmethod.Car;

/**
 * 
 * @author prav3125
 *
 */
public class CarTester {
	public static void testCar() {
		Car firstCar = new Car();
		firstCar.setColor("red");
		firstCar.setFuer("petrol");
		firstCar.setYearOfPurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuer());
		System.out.println(firstCar.getYearOfPurchase());

	}

}
