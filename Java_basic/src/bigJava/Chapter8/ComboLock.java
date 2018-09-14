package bigJava.Chapter8;
/**
 * A comboLock that can open only when given the right passcode(turning sequences)
 * @author jing
 *
 */
public class ComboLock {
	
	private int first;
	private int second;
	private int third;
	private int currentPointer;
	
	private int status;
	private boolean isValid;
	
	/**
	 * Construct a new Combolock with three given numbers
	 * @param secret1 the first number to turn right
	 * @param secret2 the second number to turn to left after the first right turning
	 * @param secret3 the third number to turn back to right after the second left turning
	 */
	public ComboLock(int secret1, int secret2, int secret3) {
		first = secret1;
		second = secret2;
		third = secret3;
		status = 0;
		currentPointer = 0;
		isValid = true;
		
	}
	
	/**
	 * Reset the dial back to 0
	 */
	public void reset() {
		currentPointer = 0;
		status = 0;
		isValid = true;
		
	}
	
	/**
	 * Implementing turning left by given ticks
	 * @param ticks the numbers of ticks need to turn left
	 */
	public void turnLeft(int ticks) {
		currentPointer = (currentPointer-ticks + 40) % 40;
		if(status == 1) {
			if(currentPointer == second)
				status =2;
			
		}
		else
			isValid = false;
	}
	
	public void turnRight(int ticks) {
		currentPointer = (currentPointer + ticks) % 40;
		
		if(status == 0) {
			if (currentPointer == first) {
				status = 1;
			}
			
			
		}
		else if(status == 2) {
			if(currentPointer == third) {
				status = 3;
			}
		}
		else
			isValid = false;
		
	}
	
	public boolean open(){
		if(status == 3 && isValid == true)
			return true;
		else return false;
			
	}
	
	

}
