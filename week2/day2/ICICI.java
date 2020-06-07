package week2.day2;

public class ICICI implements RBI, ICICIHO {

	public void createDeposits() {
		System.out.println("You can create a deposit with minimum balance of Rs. " + minimumBalance);
	}

	public void loanToIT() {
		System.out.println("Plan by ICICI");
	}

	public void provideDebitCard(long cardNumber) {
		System.out.println("Provide debit card " + cardNumber);
	}

	@Override
	public void provideGoldLoans() {
		System.out.println("Provide Gold loans");
	}

	@Override
	public void holidays() {
		System.out.println("Work from home");
	}

	@Override
	public void provideHomeLoan() {
		System.out.println("Provide Home loans");
	}

	@Override
	public void reimburseLPGSubsidary() {
		// TODO Auto-generated method stub
		
	}

}
