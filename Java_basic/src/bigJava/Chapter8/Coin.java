package bigJava.Chapter8;
/**
 * 
 * @author jing
 *
 */
public class Coin {
	/**
	 * the value of the coin
	 */
	private double value;
	
	/**
	 * The name of the coin
	 */
	private String name;
	
	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
	}
	
	public double getValue() {
		return value;
	}
	
}
