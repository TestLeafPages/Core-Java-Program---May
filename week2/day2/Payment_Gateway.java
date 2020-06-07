package week2.day2;

public class Payment_Gateway {
public void verifyCVV(int cvv) {
	MySecuredData data = new MySecuredData();
	if(data.getCVV()==cvv) {
		System.out.println("CVV verified");
	}
	else {
		System.out.println("Please check the CVV");
	}
}
public static void main(String[] args) {
	new Payment_Gateway().verifyCVV(123);
	new Payment_Gateway().depositAmount(500000);
}

public void depositAmount(int money) {
	MySecuredData data = new MySecuredData();

	System.out.println("Balance Before Deposit: "+data.getBalance());
	data.setBalance(money);
	System.out.println("Balance After Deposit: "+data.getBalance());

	
}
}
