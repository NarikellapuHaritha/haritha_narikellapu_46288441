package LambdaAssignment;

import java.util.LinkedList;
import java.util.function.Predicate;

public class removeif {
	public static void main(String[]args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Anu");
		list.add("mani");
		list.add("Ramu");
		list.add("john");
		list.add("Chandu");
		
		Predicate<String> pr=a->(a.length()%2!=0);
	list.remove(pr);
	System.out.println("data after removing="+list);
	}

}
