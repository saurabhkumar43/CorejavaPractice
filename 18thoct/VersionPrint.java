/*
Program: To Print java version
@author: Saurabh Kumar
@Date: 18oct2022  
*/

//declaring a class
class VersionPrint
{
	//main method
	public static void main(String args[])
	{
       System.out.println("The Version of java is: "+System.getProperty("java.version"));
	   
	   int num=45;
	   int sum= num++;
	   System.out.println("Value of sum using num++ :"+ sum);
	   
	   int num2=58;
	   sum= ++num2;
	   System.out.println("value of sum using ++num2 :"+ sum);
	   
	   
	   int n=5;
	   System.out.println("Not n :"+ ~n);
	   
		
		
	}
	// end of main
}
// end of class VersionPrint