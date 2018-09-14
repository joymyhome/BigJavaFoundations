package bigJava.Chapter8;

public class ComboLockDemo {
	
	public static void main(String[] args) {
		ComboLock lock = new ComboLock(5, 2, 3);
		lock.reset();
		
		lock.turnLeft(4);
		lock.turnRight(15);
		lock.turnLeft(20);
		
		System.out.println(lock.open());
		
		lock.reset();
		
		lock.turnRight(8);
		lock.turnLeft(3);
		lock.turnRight(1);
		
		System.out.println(lock.open());
	}
	

}
