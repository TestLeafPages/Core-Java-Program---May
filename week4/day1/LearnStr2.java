package week4.day1;

public class LearnStr2 {
	public static int c = 10;	
public static void main(String[] args) {
	
	Integer a = 5;
	
	
	// Take a string
	String str = "what goes out will come in another way";
	// split it into array of words
	String[] array = str.split(" ");
	// Iterate the words
	for (int i = 0; i < array.length; i++) {
		// Check for even index
		if(i%2!=0) {
			// Take that word
			String text = array[i];
			// Print it in reverse
			for(int j = text.length()-1; j>=0;j--) {
				System.out.print(text.charAt(j));
			}
		}else {
			// Print it as such
			System.out.print(array[i]);
		}
		System.out.print(" ");
	}
}
}
