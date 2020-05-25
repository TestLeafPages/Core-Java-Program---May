package week1.day2;

public class Calculator {
	
	public String text = "Testleaf";
	
// AccessModifier ReturnType methodName(args if needed){ 	}
	public int addTwoNumbers(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public void clearScreen() {
		System.out.println("I Cleared the screen");
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.text);
		int result1 = cal.addTwoNumbers(500,444);
		int result2 = cal.addTwoNumbers(998,123);
		int result3 = cal.addTwoNumbers(550,777);
		
		System.out.println(result1+"\n"+result2+"\n"+result3);
		cal.clearScreen();
	}
}
