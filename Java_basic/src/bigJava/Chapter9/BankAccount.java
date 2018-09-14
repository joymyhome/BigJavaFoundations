package bigJava.Chapter9;

public class BankAccount {
	
	private double balance;
	
	
	/**
	 * makes a deposit into this account
	 * @param amount the amount of the deposit
	 */
	public void deposit(double amount) {
		balance = balance + amount;
	}
	/**
	 * Makes a withdrawl from this account,or charges a penalty if
	 * sufficient funds are not available
	 * @param amount the amount of the withdrawal
	 */
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	/**
	 * Carries out the end of month processing that is appropriate
	 * for this account
	 */
	public void mounthEnd() {
		
	}
	
	/**
	 * Gets the current balance of this bank account
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

}
