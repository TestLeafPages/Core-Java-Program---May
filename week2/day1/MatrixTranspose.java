package week2.day1;

public class MatrixTranspose {
public static void main(String[] args) {
	
	int[][] array = {{1,2,3},
					 {4,5,6},
					 {7,8,9}
					 };
	System.out.println("Actual Matrix:" );
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Transpose Matrix:" );
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[j][i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
		/*
		 * int[][] array3 = new int[3][4]; array3[0][1] = 1; array3[0][2] = 2;
		 */
	
}
}
