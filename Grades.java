package javaassignment;

import java.util.Scanner;

public class Grades {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,tot;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		tot=a+b+c;
		if(a>60 && b>60 && c>60 )
		{
			System.out.println("passed");
		}
		else if ((a>60 && b>60) || (a>60 && c>60) || (a>60 && c>60))
		{
			System.out.println("promoted");
			
		}
		else
		{
			System.out.println("failed");
		}
	}
}
	
		
		
		
	
		
	
