package javaassignment;

import java.util.Scanner;

public class interest{
	public static  void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		int si=(p*t*r)/100;
		double ci=p*
				(Math.pow((1+r/100),t));
		System.out.println("Simple interest is"+si);
		System.out.println("Compound interest is"+ci);
	}
}
		
    



