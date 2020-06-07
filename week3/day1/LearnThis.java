package week3.day1;

public class LearnThis {
	 LearnThis() {
		this("Balaji");
		System.out.println("First Constructor");
	}
	 LearnThis(String str) {
		 this(5);
		System.out.println("Hello "+str);
	}
	 LearnThis(int a){
		 System.out.println("This is the third constructor: "+a);
	 }
int a = 5;
public void print(String name) {
	System.out.println("Hello "+name);
}
public void printdata() {
	int var = this.a;
System.out.println(this.a);
this.print("Balaji");
}
public static  void main(String[] args) {
	LearnThis obj = new LearnThis();
	System.out.println(obj.a);
	
	obj.print("Balaji");
	System.out.println("*********************");
	obj.printdata();
	
}
}
