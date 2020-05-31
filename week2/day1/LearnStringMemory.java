package week2.day1;

public class LearnStringMemory {
	public static void main(String[] args) {
	String str1 = new String("testleaf");
	String str2 = new String("testleaf");
	System.out.println("Object comparison using == " + (str1 == str2));
	System.out.println("Object comparison using .equals "+str1.equals(str2));
	
	String str3 = "testleaf";
	String str4 = "testleaf";
	System.out.println("Literal comparison using == " + (str3 == str4));
	System.out.println("Literal comparison using .equals "+str3.equals(str4));
	

}
}
