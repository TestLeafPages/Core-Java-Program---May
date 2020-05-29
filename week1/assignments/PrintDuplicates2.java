package week1.assignments;

public class PrintDuplicates2 {
public static void main(String[] args) {
	int[] num = {11,2,3,45,11,79,86,3,97,21,68,79};
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				System.out.println("Duplicate Number: "+num[i]);
			}
		}
	}
}
}
