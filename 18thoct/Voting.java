 /*
Program: To check Voting Eligibility
@author: Saurabh Kumar
@Date: 18oct2022  
*/
//importing packages
import java.util.*;

//declaring a class
class Voting
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age:");
		// creating variables
		int age= sc.nextInt();
		
		if(age>=18)
			System.out.println("You are eligible :"+age);
		else
		   System.out.println("You are not eligible :"+age);	
		
		
	}
		
	
	// end of main
}
// end of class 
