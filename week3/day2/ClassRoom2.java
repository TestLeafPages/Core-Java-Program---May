package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom2 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("james");
	list.add("adams");
	list.add("joe");
	list.add("Jon");
	list.add("khalesi");
	list.add("james");
	list.add("hodor");
	System.out.println("Duplicate values are: ");
	for (String eachName : list) {
		if((eachName.startsWith("j"))||(eachName.startsWith("J"))) {
			System.out.print(eachName+" ");
		}
	}
	
}
}
