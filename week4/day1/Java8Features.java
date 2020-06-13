package week4.day1;

import java.util.HashMap;
import java.util.Map;

public class Java8Features {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("A", 1);
	map.put("B",2);
	map.put("C", 3);
	map.replace("A",1,2);
	map.forEach((key,value)->System.out.println(key+" -> "+value));
	
}
}
