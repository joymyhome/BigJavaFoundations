package bigJava.Chapter8;

public class BankAccount {
	private int id;
	private double balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(int anId, double initialBalance) {
		id = anId;
		balance = initialBalance;
	}
	
	public BankAccount deposit(BankAccount account, double amount) { //使得class变得immutable
		
		return new BankAccount(account.id, account.balance+amount);
	}
	
	public BankAccount withdraw(BankAccount account, double amount) {
		return new BankAccount(account.id, account.balance-amount);
	}
	
	public double getBalance() {
		return balance;
	}
}
