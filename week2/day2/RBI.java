package week2.day2;

public interface RBI extends GOI {
	
public static void lendLoanstotheBanks() {
	System.out.println("Lend loans to ICICI");
}
	
public int limit = 900000;
public int minimumBalance = 5000;
public void createDeposits();
public void provideDebitCard(long cardNumber);
public void provideHomeLoan();

}
