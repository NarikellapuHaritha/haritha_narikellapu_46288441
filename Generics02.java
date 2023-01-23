package genericsassignment;

import java.util.HashMap;

public class Generics02 {
	public  static void main(String[]args) {
		HashMap<Integer,Double> hm=new HashMap<>();
		hm.put(647,4.28);
		hm.put(463, 6.28);
		hm.put(646, 98.28);
		hm.put(378,47.8);
		hm.put(347, 48.98);
		hm.put(753, 7.28);
		hm.put(257, 49.8);
		hm.put(578, 95.28);
		hm.put(477, 89.8);
		hm.put(358, 46.808);
		hm.forEach((k,v)->System.out.println(k +" "+v));
	}

}
