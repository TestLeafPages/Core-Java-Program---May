package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class Java8Features1 {
public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("Aasdf");
	names.add("Adfg");
	names.add("Basdf");
	names.add("Casdf");
	names.removeIf(eachName -> eachName.startsWith("A"));
	System.out.println(names);
}
}
