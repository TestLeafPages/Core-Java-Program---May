package week1.assignments;

import java.util.Arrays;

public class AscendingSort {
public static void main(String[] args) {
	String[] num = {"Voldemort","Dumbledore","harry","ron","snape","Hagrid"};
	Arrays.sort(num);
	System.out.println("For Iterator");
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	System.out.println(Arrays.toString(num));
	System.out.println("**********for each**********");
	for (String eachName : num) {
		System.out.println(eachName);
	}
	System.out.println("**********while**********");
	int i =0;
	while(i<num.length) {
		System.out.println(num[i++]);
	}










}
}
