package LambdaAssignment;

import java.util.*;

public class Keyvaluestring {
	public static void main(String args[]) {
		TreeMap<String,String> map=new TreeMap<>();
		map.put("apple","grapes");
		map.put("mango", "banana");
		map.put("papaya","melon");
		map.put("orange","cucumber");
		StringBuilder s=new StringBuilder();
		for(Map.Entry m:map.entrySet()) {
			String s1=(m.getKey()+""+m.getValue()+"/").toString();
			s.append(s1);
		}
		System.out.println(s);
			
		}


}
