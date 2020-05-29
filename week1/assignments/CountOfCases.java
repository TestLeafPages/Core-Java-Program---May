package week1.assignments;

public class CountOfCases {
public static void main(String[] args) {
	String str = "Numbers have life; they're not just symbols on paper. See Rs.1,00,000/-";
	int uppercase = 0, lowercase = 0, spaces = 0, number =0;
	for(int i=0; i< str.length();i++) {
		char temp = str.charAt(i);
		if(Character.isDigit(temp)) {
			number++;
		}
		else if(Character.isUpperCase(temp)) {
			uppercase++;
		}
		else if(Character.isLowerCase(temp)) {
			lowercase++;
		}
		else if(Character.isSpaceChar(temp)) {
			spaces++;
		}
		
	}
	
	System.out.println("Upper case: "+uppercase);
	System.out.println("Lower case: "+lowercase);
	System.out.println("Numbers: "+number);
	System.out.println("Spaces: "+spaces);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
