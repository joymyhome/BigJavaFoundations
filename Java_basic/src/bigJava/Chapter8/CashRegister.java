package bigJava.Chapter8;

/**problem E8.1
 * A cash register totals up sales and computes change due
 * @author jing
 *
 */
public class CashRegister {
	/**
	 * purchase records the total money a customer buys
	 */
	private double purchase;
	
	/**
	 * payment records the total money the machine receives
	 */
	private double payment;
	
	/**
	 * Construct an initial status where 0 purchase is made and 0 payment has received.
	 */
	public CashRegister() {
		purchase = 0;
		payment = 0;
	}
	
	/**
	 * Records the purchase price of an item
	 * @param amount
	 */
	public void recordPurchase(double amount) {
		purchase = purchase + amount;
	}
	
	/**
	 * Records the total payment received
	 * @param coinCount number of this type of coin
	 * @param coinType type of the coin received
	 */
	public void receivePayment(int coinCount, Coin coinType) {
		payment = payment + coinCount*coinType.getValue();
	}
	
	/**
	 * Returns the number of coins of a particular type to return 
	 * @param coinType the coinType needs to return
	 * @return number of that coinType
	 */
	public int giveChange(Coin coinType) {
		int num =  (int) ((payment - purchase) / coinType.getValue());
		payment = payment- num*coinType.getValue();
		return num;
		
	}
	
	
	
	public double getPayment() {
		return payment;
	}
	
	
	
	
	

}
