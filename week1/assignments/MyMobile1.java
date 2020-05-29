package week1.assignments;

public class MyMobile1 {
public static void main(String[] args) {
	Mobile obj = new Mobile();
	System.out.println(obj.brand);
	System.out.println(obj.ramSize);
	obj.makeCall();
	obj.sendSMS();
}
}
