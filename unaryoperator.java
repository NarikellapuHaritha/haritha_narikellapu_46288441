package LambdaAssignment;

import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class unaryoperator {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Anu");
		list.add("manu");
		list.add("thuni");
		list.add("anusri");
		list.add("john");
		list.add("chinnu");
		UnaryOperator<String> u=t->t.toUpperCase();
		for(String string:list) {
			System.out.println(u.apply(string));
		}
	}

}
