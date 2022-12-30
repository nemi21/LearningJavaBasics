package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		
		//Type obj = new Type(argument);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		int number1 = scanner.nextInt();
		
		System.out.println("Enter Number2: ");
		int number2 = scanner.nextInt();
		System.out.println("");
		
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		
		System.out.print("Choose Operation: ");
		int choice = scanner.nextInt();
		
		System.out.println("\n" +"Number1 is " + number1);
		System.out.println("Number2 is " + number2);
		System.out.println("Choice selected is: " + choice + "\n");
		
		performOperationsUsingNestedSwitch(number1, number2, choice);
	}

	private static void performOperationsUsingNestedIfElse(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.println("The Results is: " + (number1 + number2));
		}else if(choice == 2) {
			System.out.println("The Results is: " + (number1 - number2));
		}else if(choice == 3) {
			System.out.println("The Results is: " + (number1 / number2));
		}else if(choice == 4) {
			System.out.println("The Results is: " + (number1 * number2));
		}else {
			System.out.println("Invalid Opertation");
		}
	}
		
	private static void performOperationsUsingNestedSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1 : System.out.println("The Results is: " + (number1 + number2));
			break;
		case 2 : System.out.println("The Results is: " + (number1 - number2));
			break;
		case 3 : System.out.println("The Results is: " + (number1 / number2));
			break;
		case 4 : System.out.println("The Results is: " + (number1 * number2));
			break;
		default : System.out.println("Invalid Opertation");
			break;
		}
		
	}

}
