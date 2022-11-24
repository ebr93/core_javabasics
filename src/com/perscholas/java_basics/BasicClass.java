package com.perscholas.java_basics;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 15;
		
		double A = 15;
		double B = 5.5;
		
		sumInt(a, b);
		sumDouble(A, B);
		sum(a, B);
		division(a, b);
		divisionDouble(A, B);
		divisionEx();
		namedConstant(777.5);
		cafeStore();
	}
	
	public static void sumInt(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public static void sumDouble(double a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}
	
	public static void sum(int a, double b) {
		double sum = a + b;
		System.out.println(sum);
	}
	
	public static void division(int a, int b) {
		double quotient = a > b ? (double)a / b 
				: (double)b / a;
		System.out.println(quotient);
	}
	
	public static void divisionDouble(double a, double b) {
		double quotient = a > b ? a / b : b / a;
		System.out.println(quotient);
		int intQ = (int)quotient;
		System.out.println(quotient);
	}
	
	public static void divisionEx() {
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println(q);
		double yDouble = (double)y;
		q = yDouble / x;
		System.out.println(q);
	}
	
	public static void namedConstant(double n) {
		final int MODULO_INT = 5;
		double remainder = n % MODULO_INT;
		System.out.println(remainder);
	}
	
	public static void cafeStore() {
		double coffee = 3.55;
		double latte = 4.37;
		double espresso = 3.99;
		final double SALES_TAX = 1.085;
		
		double subtotal = coffee * (3) + latte * (4) + espresso * (2);
		double totalSale = Math.round(SALES_TAX * subtotal * 100) / 100.0; // multiplying by 100, rounding, and dividing by 100 allows the rounding to show the hundredth decimal place

		System.out.println(totalSale);
	}
	
	

}
