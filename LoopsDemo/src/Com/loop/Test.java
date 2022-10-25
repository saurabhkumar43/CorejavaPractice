/*
This is a demo class to test package
@author: Saurabh Kumar
@Date: 25th oct 2022  
*/

//creating a pacakge
package Com.loop;

//declaring a class to test package demo
public class Test {
	
    //main method    
	public static void main(String[] args) {
	
    //creating a object of demo class	
	LoopDemo obj1 = new LoopDemo();
	
	//calling the method
	 obj1.printValue();
	
	//calling static directly with the name of class: no object required
	LoopDemo.printMessage();

	}
     //end of main method
}
 //end of class