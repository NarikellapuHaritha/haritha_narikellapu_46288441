package javaassignment;
import java.util.*;
	public class InsufficientBalanceException extends Exception{
		public InsufficientBalanceException(String str) {
			
		}
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			
			double balance=sc.nextDouble();
			double withdraw=sc.nextDouble();
			
			try {
				if(balance>=0 && withdraw > balance) {
					System.out.println("Please check your balance:");
					throw new InsufficientBalanceException("msg");
				}
				else {
					System.out.println("Your balance is:"+(balance-withdraw));
				}
			}catch(InsufficientBalancException e) {
				System.out.println(e);
			}
		}
	}

