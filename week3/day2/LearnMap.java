package week3.day2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("One plus 7T pro", 47999);
	map.put("Iphone 11 Max pro", 121900);
	map.put("Samsung S20 Ultra", 97999);
	map.put("One plus 7T", 47999);
	System.out.println(map);
	for (Entry<String, Integer> eachEntry : map.entrySet()) {
		System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
	}
	System.out.println("*****************************");
	Set<String> keySet = map.keySet();
	for (String eachKey : keySet) {
		System.out.println(eachKey+" -> "+map.get(eachKey));
	}
	Collection<Integer> values = map.values();
	System.out.println(values);
	System.out.println(map.containsKey("One plus 7T"));
	System.out.println(map.containsValue(121900));
	
	


}
}
