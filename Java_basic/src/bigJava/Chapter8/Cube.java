package bigJava.Chapter8;

public class Cube {

	private double height;
	public Cube(double h) {
		height = h;
	}
	
	public double volumn() {
		return height*height*height;
	}
	
	public double surfaceArea() {
		return height* height * 6;
		
	}
}
