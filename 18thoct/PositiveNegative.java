 /*
Program: To Check Positive and Negative numbers
@author: Saurabh Kumar
@Date: 18oct2022  
*/
//importing packages
import java.util.*;

//declaring a class
class PositiveNegative
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number:");
		// creating variables
		int num= sc.nextInt();
		System.out.println("Enter second number:");
		
		if(num>=0)
			System.out.println("The number is positive :"+num);
		else
		   System.out.println("The number is negative :"+num);	
		
		
	}
		
	
	// end of main
}
// end of class 