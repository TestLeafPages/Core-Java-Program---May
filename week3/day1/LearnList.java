package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(99);
	list.add(27);
	list.add(54);
	list.add(84);
	list.add(27);
	list.add(1, 100);
	list.set(2, 35);
	System.out.println(list.size());
	System.out.println("*************************");
	System.out.println(list);
	System.out.println("*************************");
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 * System.out.println("*************************"); for (Integer eachNumber :
		 * list) { System.out.println(eachNumber); } list.set(0, 90);
		 * System.out.println(list.contains(99)); Collections.sort(list);
		 * Collections.reverse(list); System.out.println(list);
		 */
	
	
	
	
	
}
}
