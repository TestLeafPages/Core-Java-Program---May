package week2.day2;

public class MySecuredData {
private final short cvv = 123;
private int balance = 0;

public short getCVV() {
	return cvv;
}

public  void setBalance(int money) {
	balance = money;
}
public int getBalance() {
return balance;
}
}
