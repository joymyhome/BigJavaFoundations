package bigJava.Chapter8;

public class CashRegisterTestor {
	public static void main(String[] args) {
		CashRegister register = new CashRegister();
		register.recordPurchase(2.3);
		Coin dollar = new Coin(1, "dollar");
		Coin quater = new Coin(0.25, "quarter");
		Coin nickel = new Coin(0.05, "nickel");
		Coin penny = new Coin(0.01, "penny");
		
		register.receivePayment(6, dollar);
		register.receivePayment(3, quater);
		register.receivePayment(50, nickel);
		register.receivePayment(5, penny);
		
		System.out.println(register.getPayment());
		
		System.out.println(register.giveChange(dollar) + " dollar");
		System.out.println(register.giveChange(quater) + " quarter");
		System.out.println(register.giveChange(nickel) + " nickel");
		System.out.println(register.giveChange(penny) + " penny");
		
		
	}
}
