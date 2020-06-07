package week2.day2;

public class Calculator {
	int a, b;
	// Constructor 1
	public Calculator() {
		System.out.println("Calculator is running");
	}
	// Constructor 2
	public Calculator(int x, int y) {
		a = x;
		b = y;
	}
	public void add() {
		System.out.println("Sum: " + (a + b));
	}
	public void add(int a, int b) {
		System.out.println("Sum: "+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Sum: "+(a+b+c));
	}
	public void add(double a, double b) {
		System.out.println("Sum: "+(a+b));
	}
	
	
}
