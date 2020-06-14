package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnForEach {
public static void main(String[] args) {
	System.out.println(Weekdays.SUNDAY);
	
	
	
	List<String> list = new ArrayList<String>();
	list.add("Arun");
	list.add("Bala");
	list.add("Chandru");
	list.add("Adam");
	
	
	
	list.forEach((eachList) -> {
		if(eachList.startsWith("A"))
		System.out.println(eachList);});
}
}
