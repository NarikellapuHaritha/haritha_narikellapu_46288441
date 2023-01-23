package javaassignment;
import java.util.Scanner;

public class bank {
	public static void main(String args[]) {
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
	savings ob1=new savings();
	fixed ob2=new fixed();
	if(a.equals("savings")) {
		int c=ob1.sav(b);
		System.out.println(c);
	}
	else if(a.equals("fixed")) {
		int d=ob2.deposit(b);
		System.out.println(d);
	}
	}

}
class savings{
	int tot=0;
	public int sav(int amt) {
		return tot+amt;
	}
}
class fixed{
	int tot=0;
	public int deposit(int amt) {
		return tot+amt;
	}
}
