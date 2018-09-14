package bigJava.Chapter8;

public class FalseSwapInt {
	public static void falseSwap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		falseSwap(x, y);
		System.out.println(x + " " + y);
	}

}
