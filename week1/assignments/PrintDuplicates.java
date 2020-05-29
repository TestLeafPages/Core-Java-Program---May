package week1.assignments;

import java.util.Arrays;

public class PrintDuplicates {
public static void main(String[] args) {
	int[] num = {11,2,3,45,11,79,86,3,97,21,68,79};
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
	for (int i = 0; i < num.length-1; i++) {
		if(num[i]==num[i+1]) {
			System.out.println("Duplicate Number: "+num[i]);
		}
	}
}
}
