package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
public static void main(String[] args) {
	Set<String> set = new TreeSet<>();
	set.add("pancake");
	boolean result1 = set.add("bob");
	System.out.println(result1);
	set.add("cat");
	boolean result2 = set.add("bob");
	System.out.println(result2);
	set.add("pie");
	set.add("lollipop");
	for (String eachWord : set) {
		System.out.println(eachWord);
	}
	List<String> list = new ArrayList<>();
	list.addAll(set);
	System.out.println(list);
	
}
}
