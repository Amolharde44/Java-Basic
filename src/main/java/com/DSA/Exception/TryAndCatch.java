package com.DSA.Exception;

import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        try {
	            int number = scanner.nextInt(); // Try to read an integer from user input
	            int result = 100 / number;     // Try to perform division
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (java.util.InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer.");
	        } finally {
	            scanner.close();
	            System.out.println("Scanner closed.");
	        }

	        System.out.println("Program completed.");
	    }

	}


