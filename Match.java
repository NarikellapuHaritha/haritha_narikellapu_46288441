package javaassignment;

public class Match {
	public static void main(String args[]) {
		String str1=new String("java String pool refers to collection of Strings which are stored in heap memory");
		String str2=new String("refers");
		System.out.print("Result:");
		System.out.println(str1.regionMatches(14, str2, 6, 0));
	}

}
