/*
Program: WAP to print blood donation eligiblity
@author: Saurabh Kumar
@Date: 19oct2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedIfDemo2
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		float weight;
		char gender;
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			//taking input
			System.out.println("Enter your gender(male/female):");
		    gender= sc.next().charAt(0);
			
			System.out.println("Enter your weight:");
		    weight= sc.nextFloat();
			
			//checking weight criteria
			if(((gender=='m')&&(weight>=60))||((gender=='f')&&(weight>=50)))
			   System.out.println("You can donate the blood....");
   
		     else
				  System.out.println("You cannot donate the blood....Better luck next time");
			   
		}
		else
			System.out.println("You are too young to donate blood... sorry!" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 