package javaassignment;

import java.util.Scanner;

public class User_authentication {
	public static void main(String args[])
	{
		String username,password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		username=sc.nextLine();
		System.out.println("Enter password:");
		password=sc.nextLine();
		if(username.equals("haritha") && password.equals("haritha@578"))
		{
			System.out.println("Authentication Successful");
		}
		else
		{
			System.out.println("Authentication Failed");
		}
	}

}
