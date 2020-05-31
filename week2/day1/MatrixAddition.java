package week2.day1;

public class MatrixAddition {
public static void printArray(int[][] array) {
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
}
	
public static void main(String[] args) {
	
	int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
	int[][] array2 = {{9,8,7},{6,5,4},{3,2,1}};
	int[][] result = new int[3][3];
	System.out.println("Array 1:");
	printArray(array1);
	System.out.println("Array 2:");
	printArray(array2);
	for (int i = 0; i < array1.length; i++) {
		for (int j = 0; j < array1[i].length; j++) {
			result[i][j] = array1[i][j] + array2[i][j];
		}
	}
	System.out.println("Solution: ");
	printArray(result);
	
	
}
}
