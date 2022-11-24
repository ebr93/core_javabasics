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
	

}
