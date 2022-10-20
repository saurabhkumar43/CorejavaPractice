/*
Program: WAP to perform aritmatic operation
@author: Saurabh Kumar
@Date: 20oct2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class Calculator
{
	// method to add two numbers
	static void add(float n1,float n2) // formal/dummy arguments
	{
         float result=n1+n2;
		 System.out.println("The result is :"+result);
		 
    }
	//end of method
	
	//method to sub two numbers
	static void sub(float n1, float n2) //formal/dummy arguments
	{
		float result=n1-n2;
		System.out.println("The result is :"+result);
	}
	
	//method to mul two numbers
	static void multiply(float n1, float n2) //formal/dummy arguments
	{
		float result=n1*n2;
		System.out.println("The result is :"+result);
	}
	
	//method to divide two numbers
	static void divide(float n1, float n2) //formal/dummy arguments
	{
		float result=n1/n2;
		System.out.println("The result is :"+result);
	}
	//end of method
	
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float num1,num2;
		int choice;
		
		//input 2 numbers
	    System.out.println("Enter the two numbwrs:");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		
		//menu
		System.out.println("Enter the choice:");
		System.out.println("1, Add");
		System.out.println("2, sub");
		System.out.println("3, multiply");
		System.out.println("4, divide");
		System.out.println("5, exit");
		choice=sc.nextInt();
		
	
		
	
	   //switch case
	   switch(choice)
	   {
		   case 1:add(num1,num2);
		          break;
		   case 2:sub(num1,num2);
		          break;
		   case 3:multiply(num1,num2);
		          break;
		   case 4:divide(num1,num2);
		          break;
		   case 5:System.exit(0);
		          break;
		  default: System.out.println("Wrong input");
				  
	   }
	// end of switchcase
		
	
		
		    
	}
		
	// end of main
}
// end of class 