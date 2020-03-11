package com.lambda.examples;

interface Arithmetic {
	int operation(int a, int b);
}

interface EvenOdd {
	void check(int a);
}

public class LambdaArithmetic {

	public static void main(String[] args) {

		// Addition using Lambda expression
		Arithmetic addition = (int a, int b) -> (a + b);
		// Arithmetic addition = (int a, int b) -> {return a + b;};

		System.out.println("Addition = " + addition.operation(5, 6));

		// Subtraction using Lambda expression
		Arithmetic subtraction = (int a, int b) -> (a - b);

		System.out.println("Subtraction = " + subtraction.operation(5, 3));

		// Multiplication using Lambda expression
		Arithmetic multiplication = (int a, int b) -> (a * b);

		System.out.println("Multiplication = " + multiplication.operation(4, 6));

		// Division using Lambda expression
		Arithmetic division = (int a, int b) -> (a / b);

		System.out.println("Division = " + division.operation(12, 6));

		
		
		/*
		 * Even/Odd Number check 
		 */
		EvenOdd evenOdd = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("Number " + a + " is even.");
			} else {
				System.out.println("Number " + a + " is odd.");
			}
		};

		evenOdd.check(5);
		evenOdd.check(8);
	}

}
