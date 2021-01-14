package com.qa.main;

import java.util.Scanner;

public class Calculator {
	
	
	
	public static void run() {

		inputNumbers();	
	}
	
	
	static void inputNumbers() {
		
		Scanner input = new Scanner(System.in);
		double input1;
		double input2;
		double result;
		int method1;
		int subchoice1;
	
		
		System.out.println("Please Enter the First Integer:");
		input1 = input.nextDouble();
		System.out.println("Please Enter the Second Integer:");
		input2 = input.nextDouble();
		
		//choosing method
		
		System.out.println("\nPlease Choose a Calculation Method\n\t");
		System.out.println("1 : Addition");
		System.out.println("2 : Subtraction");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division\n");
		
		
		method1 = input.nextInt();
		
		
		//Addition
		if (method1 == 1) {
			result = input1 + input2;
			System.out.println("The Addition of the two integers is equal to = " + result);
			
		//Subtraction
		}else if (method1 == 2) {
			System.out.println("Choose which integer to Subtract from the other");
			System.out.println("1 : " + input1);
			System.out.println("2 : " + input2);
			subchoice1 = input.nextInt();
			
			if (subchoice1 == 1) {
				result = input2 - input1;
				System.out.println("The Subtraction of Integer1 from Integer2 = "  + result);
			}else if (subchoice1 == 2) {
				result = input1 - input2;
				System.out.println("The Subtraction of Integer2 from Integer1 = "  + result);
			}else {
				System.out.println("Choice has to be in form of 'input1' or 'input2'.");
			}
		
		//Multiplication			
		}else if (method1 == 3) {
			result = input1 * input2;
			System.out.println("The Muliplication of the integers = " + result);
			
		//Division	
		}else if (method1 == 4) {
			System.out.println("Choose which integer to Divide by the other");
			System.out.println("1 : " + input1);
			System.out.println("2 : " + input2);
			
			subchoice1 = input.nextInt();
			if (subchoice1 == 1) {
				result = input1 / input2;
				System.out.println("The Division of Integer1 by Integer2 = " + result);
			}else if (subchoice1 == 2) {
				result = input2 / input1;
				System.out.println("The Division of Integer2 by Integer1 = " + result);
			}else {
				System.out.println("Choice has to be in form of 'input1' or 'input2'.");
			}
			
		}else {
			System.out.println("Method has to be  '1 : Addition', '2: Subtraction', '4: Division','3: Multiplication'.");
			
		}
		
		input.close();
		System.out.println("End of Calculator Program");
	}
	
	

}
