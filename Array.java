package javaassignment;

import java.util.Scanner;

public class Array {
	public static void main(String arg[]) {
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==n) {
						
						System.out.println("elements is present");
					}
				}
		}

}

