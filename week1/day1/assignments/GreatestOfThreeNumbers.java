package week1.day1.assignments;

public class GreatestOfThreeNumbers {
	public static void main(String[] args) {
		int a = 10, b = 3, c = 5;
		if(a>b && a>c) {
			System.out.println("A is greater "+a);
		}
		else if(b>a && b>c) {
			System.out.println("B is greater "+b);
		}
		else {
			System.out.println("C is greater "+c);
		}
	}
}
