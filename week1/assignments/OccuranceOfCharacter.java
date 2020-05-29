package week1.assignments;

public class OccuranceOfCharacter {
public static void main(String[] args) {
	String str = "It always seems impossible until it's done";
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)=='i')
			count++;
	}
	System.out.println("No. of occurance of i is: "+count);
}
}
