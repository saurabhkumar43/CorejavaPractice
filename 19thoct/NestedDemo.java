/*
Program: WAP to print to check eligiblity of blood donor 
@author: Saurabh Kumar
@Date: 19oct2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class NestedDemo
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
			if(gender=='m')
			{
				if(weight>=60)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight... Please start healthy eating habits");
					
			}
			else
			{
				if(weight>=50)
					System.out.println("You can donate the blood....");
				 else
				System.out.println("You are underweight... Please start healthy eating habits");
				
			}
		   
			//end of nested ifelse
			
		}
		else
			System.out.println("You are too young to donate blood... Please wait!" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 