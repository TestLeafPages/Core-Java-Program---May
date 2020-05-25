package week1.day2;

public class LearnStatic {
	public int a = 5;
	public static int b = 10;
	
	public void change() {
		LearnStatic obj = new LearnStatic();
		a=a+5;
		System.out.println(a);
		LearnStatic.b = b+10;
	}

	public void print() {
		System.out.println("Printed");
	}
	public static void clear() {
		System.out.println("Cleared");
	}
	public static void main(String[] args) {
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.a);
		System.out.println(b);
		
		obj.print();
		clear();
	}
}
