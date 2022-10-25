/*
Program:WAP for arithmatic operations like addition,subtraction,multiplication,division.
@author: Saurabh Kumar
@Date: 25th oct 2022  
*/

//creating a pacakge
package Com.test;

//import packages
import java.util.Scanner;

import Com.calcu.Calculator;

//declaring a class
public class CalciTest {

	// Menu
	static void menu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		System.out.println("Enter the type of calculation you want:");
	}

	// main started
	public static void main(String[] args) {

		// declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int choice;
		float number1, number2, result = 0.0f;
		System.out.println("Enter first number:");
		number1 = sc.nextFloat();

		System.out.println("Enter second number:");
		number2 = sc.nextFloat();

		menu();

		choice = sc.nextInt();

		switch (choice) { // switch case

		case 1:
			result = Calculator.addition(number1, number2);
			break;
		case 2:
			result = Calculator.subtraction(number1, number2);
			break;
		case 3:
			result = Calculator.multiplication(number1, number2);
			break;
		case 4:
			result = Calculator.division(number1, number2);
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid Input........");

		}// end of switch case

		System.out.println("The result is:" + result);

	}// end of main

}
//end of class