package bigJava.Chapter9;

public class SavingAccount extends BankAccount{
	
	
	private double interestRate;
	private double minBalance;
	/**
	 * Constructs a saving account with zero balance
	 */
	public SavingAccount() {
		
	}
	
	/**
	 * Sets the interest rate for this account
	 * @param rate the monthly interest rate in percent
	 */
	public void setInterestRate(double rate) {
		
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount);
		double balance = getBalance();
		if(balance < minBalance) {
			minBalance = balance;
		}
	}
	
	public void monthEnd() {
		double interest = minBalance * interestRate / 100;
		deposit(interest);
		minBalance = getBalance();
	}

}
