package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassRoom1 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(12);
	list.add(22);
	list.add(33);
	list.add(22);
	list.add(24);
	list.add(35);
	list.add(46);
	list.add(57);
	list.add(89);
	list.add(46);
	list.add(12);
	Set<Integer> set = new LinkedHashSet<>();
	for (int i = 0; i < list.size(); i++) {
		boolean result = set.add(list.get(i));
		if(result==false) {
			System.out.println(list.get(i));
		}
	}
	System.out.println(set);
}
}
