/*
Program: To understand commandline arguments
@author: Saurabh Kumar
@Date: 14oct2022  
*/

//declaring a class
class AdditionDemo
{
	//main method
	public static void main(String args[])
	{
		//declaring local variables
	   //int num1= Integer.parseInt(args[0]);
		//int num2= Integer.parseInt(args[1]);
		
		// parsing String to Float
		float num1= Float.parseFloat(args[0]);
		float num2= Float.parseFloat(args[1]);
		
		//calculating the sum
		float sum = num1+ num2;
		System.out.println("The sum of numbers is :"+sum); // printing the value of sum
		
		
	}
	// end of main
}
// end of class AdditionDemo