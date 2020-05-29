package week1.assignments;

public class ExtractNumbers {
public static void main(String[] args) {
	String str = "Regd. 1994 Since 1995";
	String number = str.substring(6);
	System.out.println(number);
	for (int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i)))
			System.out.print(str.charAt(i));
	}
	System.out.println();
	System.out.println(str.replaceAll("[^0-9]", ""));
}
}
