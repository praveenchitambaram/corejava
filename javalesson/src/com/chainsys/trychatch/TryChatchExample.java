package com.chainsys.trychatch;

import java.util.Scanner;

public class TryChatchExample {
	public static void m11() {
	int x=0,y=0,z=0;
	String s1=null,s2=null;
	java.util.Scanner sc=null;
	try {
	
		sc=new Scanner(System.in);
		System.out.println("inside try");
		System.out.println("Enter value for X");
		s1=sc.nextLine();
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=x/y;
		System.out.println("Result"+z);
	}
	/*catch(Exception err)
	 * {
	 * System.out.println("Inside Catch3"+err.get Message());
	 * System.out.println("ErrorType"+getClass().getName());
	 */
	catch(ArithmeticException err){
		System.out.println("Inside catch1"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	catch(NumberFormatException err){
		System.out.println("Inside catch2"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	catch(Exception err){
		System.out.println("Inside catch3"+err.getMessage());
		System.out.println("ErrorType"+err.getClass().getName());
	}
	finally{
		System.out.println("Inside fainally");
		sc.close();
	}
	System.out.println("Outside fainally");}
}

