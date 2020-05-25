package week1.day2;

public class CallStaticMembers {
public static void main(String[] args) {
	LearnStatic obj = new LearnStatic();
	System.out.println(obj.a);
	System.out.println(LearnStatic.b);
	obj.change();
	
	LearnStatic obj2 = new LearnStatic();
	System.out.println(obj2.a);
	System.out.println(LearnStatic.b);
	
	
		/*
		 * obj.print();
		 * 
		 * LearnStatic.clear();
		 */
}
}
