package week2.day1;

import java.util.Arrays;

public class LearnReplaceAll {
public static void main(String[] args) {
	String str = "Good Morning";
	char[] strArray = str.toCharArray();
	String string = Arrays.toString(strArray);
	System.out.println(string);
	String str1 = "I,Love,Mutton,Biriyani";
	String[] str1Array = str1.split(",");
	System.out.println(Arrays.toString(str1Array));
	
	String str2 = "Born On 2010";
	
	System.out.println(str2.replaceAll("[^A-Z]", ""));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
