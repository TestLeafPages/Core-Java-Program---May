package week4.day1;

public class ReplaceStringWords {
public static void main(String args[]) {
	String str = "good life";
	String[] array = str.split(" ");
	for (int i = 0; i < array.length; i++) {
		String word = array[i];
		for (int j = 0; j < array[i].length(); j++) {
			if(i==0&&j==0) {
				System.out.print(array[1].charAt(j));
			}
			else if(i==1&&j==0) {
				System.out.print(array[0].charAt(j));
			}
			else {
				System.out.print(word.charAt(j));
			}
		}
		System.out.print(" ");
	}
}
}
