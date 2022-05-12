package com.chainsys.variyables;

/*
 * 
 */
 public class  Calculator {
	/*
	 * add method:takes 2 integer values using the following parameters and will add
	 * the values.the result of totaling will be returned back ti the caller this a
	 * static method object reference is not required.
	 * 
	 * @param paraml of type int
	 * 
	 * @param param2 of type int
	 * 
	 * @return type int
	 */
	public static int add(int param1, int param2) {
		int result = param1 + param2;
		return result;
	}

	/*
	 * divide method:takes 2 integer values using the following parameters and will
	 * add the values.the result of totaling will be returned back ti the caller
	 * this a static method object reference is not required.
	 * 
	 * @param paraml of type int
	 * 
	 * @param param2 of type int
	 * 
	 * @return type int
	 */
	public static int multiply(int param1, int param2) {
		int result = param1 * param2;
		return result;
	}

	/*
	 * devoid method:takes 2 integer values using the following parameters and will
	 * add the values.the result of totaling will be returned back to the caller
	 * this a static method object reference is not required.
	 * 
	 * @param paraml of type int
	 * 
	 * @param param2 of type int
	 * 
	 * @return type int
	 */
	public static int divide(int param1, int param2) {
		int result = param1 / param2;
		return result;
	}

	/*
	 * subtract method:takes 2 integer values using the following parameters and
	 * will add the values.the result of totaling will be returned back ti the
	 * caller this a static method object reference is not required.
	 * 
	 * @param paraml of type int
	 * 
	 * @param param2 of type int
	 * 
	 * @return type int
	 */
	public static int subtract(int param1, int param2) {
		int result = param1 - param2;
		return result;
	}
}
