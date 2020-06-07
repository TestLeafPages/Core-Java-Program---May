package week3.day1;

public class StringRev {
public static void main(String[] args) {
	String str = "I travel from chennai to banglore by road";
	String[] array = str.split(" ");
	for (int i = 0; i < array.length; i++) {
		if(i%2!=0) {
			String temp = array[i];
			for (int j = temp.length()-1; j >= 0; j--) {
				System.out.print(temp.charAt(j));
			}
		}
		else {
			System.out.print(array[i]);
		}
		System.out.print(" ");
	}
}
}
