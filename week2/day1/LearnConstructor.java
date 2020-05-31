package week2.day1;

public class LearnConstructor {
	public LearnConstructor() {
		System.out.println("print from constructor");
	}
	String str = "test";
	public void print() {
		System.out.println("Print");
	}
public static void main(String[] args) {
	LearnConstructor obj = new LearnConstructor();
	obj.print();
}
}
