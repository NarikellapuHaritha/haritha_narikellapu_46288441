package javaassignment;

public class Arthmeticexception {
	public static void main(String args[]) {
		{
			try {
				int num1=30,num2=0;
				int output=num1/num2;
				System.out.println("Result:"+output);	
				
			}
			catch(ArithmeticException e) {
				System.out.println("you sholudnt divide a number by zero");
			}
			
			
		}
	}

}
