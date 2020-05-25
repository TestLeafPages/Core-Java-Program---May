package week1.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	int age = 25;
	int[] ages = {1,2,3,4,5};
	int length = ages.length;
	System.out.println("Length of the array: "+length);
	for (int i = 0; i < ages.length; i++) {
		System.out.println(ages[i]);
	}
	String[] names = new String[5];
	names[0] = "Hari";
	names[1] = "Dhivya";
	names[2] = "Naveen";
	names[3] = "Sarath";
	names[4] = "Sam";
	
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
	System.out.println("--------------");
	Arrays.sort(names);
	for (String eachValue : names) {
		System.out.println(eachValue);
	}
	
	
	
	
	
	
	
}
}
