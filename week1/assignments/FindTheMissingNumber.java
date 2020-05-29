package week1.assignments;

import java.util.Arrays;

public class FindTheMissingNumber {
public static void main(String[] args) {
	int[] num = {7,1,3,4,6,2,9};
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
	for (int i = 0; i < num.length-1; i++) {
		if(num[i+1]-num[i]!=1) {
			System.out.println("Missing number: "+(num[i]+1));
		}
	}
}
}
