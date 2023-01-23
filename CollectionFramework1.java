package javaassignment;

import java.util.*;
import java.util.TreeMap;

public class CollectionFramework1 {
	public static void main(String[]args) {
		Contact c1=new Contact(1234567890,"abc","abd@gmail.com");
		Contact c2=new Contact(1234567892,"abc","bcd@gmail.com");
		Contact c3=new Contact(1234567891,"abc","efg@gmail.com");
		
		Map<Long,Contact> c=new TreeMap<>(Collections.reverseOrder());
		c.put(c1.getPhNumber(), c1);
		c.put(c2.getPhNumber(),c2);
		c.put(c3.getPhNumber(),c3);
		for(long l:c.keySet())
			System.out.println(1);
		System.out.println(" ");
		for(Contact l:c.values()) {
			System.out.println(l.getName());
			System.out.println(l.getEmail());
			System.out.println(" ");
			
		}
		System.out.println(" ");
		System.out.println(c);
		System.out.println();
		for(Map.Entry<Long,Contact> entry:c.entrySet())
		{
			System.out.println("Key:"+entry.getKey());
			System.out.println("Name:"+entry.getValue().getName());
			System.out.println("Email:"+entry.getValue().getEmail());
			System.out.println();
		}


		
	}

	private static Object reverseOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
