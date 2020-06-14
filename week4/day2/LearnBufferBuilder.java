package week4.day2;

public class LearnBufferBuilder {
public static void main(String[] args) {
	String str = "Testleaf";
	System.out.println(str);
	System.out.println(str.hashCode());
	String newTxt = str.concat(" in Chennai");
	System.out.println(newTxt);
	System.out.println(newTxt.hashCode());
	StringBuffer buf = new StringBuffer("TestLeaf");
	System.out.println(buf.hashCode());
	buf.append(" in chennai");
	System.out.println(buf.hashCode());
	System.out.println(buf);
	System.out.println(buf.length());
	System.out.println(buf.capacity());
	buf.setCharAt(3, 'A');
	System.out.println(buf);
	
}
}
