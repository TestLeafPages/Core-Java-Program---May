package week4.day2;

// functional interface
interface Mobile {
	public void makePayment(long cardNumber);
}

public class LearnLambda {
	public static void main(String[] args) {
		/*
		 * Mobile obj = new Mobile() { public void makePayment(long cardNumber) {
		 * System.out.println("Make payment using: "+cardNumber); } };
		 * obj.makePayment(4515760098765400L);
		 */	
	
	
	Mobile obj = (number) -> {System.out.println("Make payment using: "+number);};
	obj.makePayment(4515760098765400L);

}
}
