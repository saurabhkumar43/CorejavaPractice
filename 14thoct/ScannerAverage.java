/*
Program: To calculate average using Scanner
@author: Saurabh Kumar
@Date: 14thoct2022  
*/

// importing util package for Scanner Class

 import java.util.Scanner;

//declaring a class
class ScannerAverage
{
	//main method
	public static void main(String args[])
	{
		//creating object of Scanner class
		Scanner sc1 = new Scanner(System.in);
		
		//declaring and initializing local variables
		
		System.out.println("Enter your first number:");
		int number1 = sc1.nextInt(); // to take first integer input
		
		System.out.println("Enter your second number:");
		int number2 = sc1.nextInt(); // to take second integer input
		
		System.out.println("Enter your third number:");
		int number3 = sc1.nextInt(); // to take third integer input
		
		int sum = number1+number2+number3;
		int average = sum/3;
		
		//To print the average
        System.out.println("Average of these numbers are:"+average);
				
	}
	// end of main
}
// end of class ScannerAverage