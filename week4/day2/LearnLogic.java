package week4.day2;

import java.util.Arrays;

public class LearnLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,4,7,8,1,5,11,15,13};
		int[] array3 = {1,4,7,1,4,7};
		int[] array4 = {};
		int[] array5 = {1,3,5,7,9};
		int[] array2 = {1,2,3,1,2,3,1,2,3,4,5,6};
		boolean flag = false;
		if(array2.length>0) {
		// Sort the array 
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		for (int i = 0; i < array2.length-1; i++) {
			
			if (array2[i]==array2[i+1]) {
				System.out.println("Duplicate value: "+array2[i]);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("No duplicates found");
		}
		}
		else {
			System.out.println("Empty array found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Solution 1: Loop through the array and compare the values
		// Solution 2: Using Tree Set
		// Solution 3: Sort the array and compare
		// Best Practices: a. Time is super important
		// b. space that you use as memory
		// c. no. of lines of code
		/*
		 * for (int i = 0; i < array1.length; i++) { for (int j = i+1; j <
		 * array1.length; j++) { System.out.println(array1[i]);
		 * System.out.println(array1[j]);
		 * System.out.println("*************************"); if (array1[i]==array1[j]) {
		 * System.out.println("Duplicate value: "+ array1[i]); }
		 * 
		 * } }
		 */
	
	}

}
