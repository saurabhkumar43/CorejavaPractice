 /*
Program: To calculate percentage and declare pass and fail
@author: Saurabh Kumar
@Date: 19oct2022  
*/
//importing packages
import java.util.*;

//declaring a class
class ResultDemo
{
	public static void main(String args[])
	{
		//creating Scanner object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the marks in science:");
		// creating variables
		int marks1= sc.nextInt();
		System.out.println("Enter the marks in maths:");
		int marks2= sc.nextInt();
		System.out.println("Enter the marks in socialstudies:");
		int marks3= sc.nextInt();
		float sum=marks1+marks2+marks3;
		float percentage=(sum/300)*100;
		
		
		
		
		if(percentage>=40)
		{
			System.out.println("congratulations you have passed the exam :"+percentage);
		}
		else
		{	
		   System.out.println("Sorry!you failed :"+percentage);	
		}
		
		
	}
		
	
	// end of main
}
// end of class