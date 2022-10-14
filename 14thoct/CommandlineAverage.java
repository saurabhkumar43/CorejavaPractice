/*
Program: To calculate average using commandline arguments
@author: Saurabh Kumar
@Date: 14oct2022  
*/

//declaring a class
class CommandlineAverage
{
	//main method
	public static void main(String args[])
	{
		
		// parsing String to Float
		float num1= Float.parseFloat(args[0]);
		float num2= Float.parseFloat(args[1]);
		float num3= Float.parseFloat(args[2]);
		
		//calculating the average
		float sum = num1+ num2+ num3;
		float average = sum/3;
		System.out.println("The average of numbers is :"+average); // printing the average of three numbers
		
		
	}
	// end of main
}
// end of class CommandlineAverage