package week1.day2;

public class LearnString {
public static void main(String[] args) {
	// Type - 1 -> String Literal
	String text1 = "TestLeaf";
	String text2 = "Chennai";
	
	int length = text1.length();
	System.out.println("Length: "+length);
	
	String upperCase = text1.toUpperCase();
	System.out.println("Uppercase: "+upperCase);
	
	String lowerCase = text1.toLowerCase();
	System.out.println("Lowercase: "+lowerCase);
	
	String concat1 = text1+text2;
	System.out.println(concat1);
	String concat2 = text1.concat(text2);
	System.out.println(concat2);
	
	String word1 = "Testleaf is in Chennai";
	String word2 = "testleaf";
	boolean result1 = word1.equals(word2);
	System.out.println(result1);
	boolean result2 = word1.equalsIgnoreCase(word2);
	System.out.println(result2);
	boolean result3 = word1.contains("Chennai");
	System.out.println(result3);
	
	String txt = "      All is well     ";
	System.out.println(txt);
	String trim = txt.trim();
	System.out.println(trim);
	String replace = trim.replace('l', '@');
	System.out.println(replace);
	
	
	String name = "Testleaf";
	//             01234567
	String ss1 = name.substring(4);
	System.out.println(ss1);
	String ss2 = name.substring(2, 6);
	System.out.println(ss2);
	
	for(int i = 0; i <= name.length();i++) {
	char character = name.charAt(i);
	System.out.println(character);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Type - 2 -> String using Object
//	String text2 = new String("Corona");
	
	
}
}
