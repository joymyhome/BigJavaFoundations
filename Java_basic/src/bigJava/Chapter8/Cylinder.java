package bigJava.Chapter8;

public class Cylinder {
	private double height;
	private double radius;
	public Cylinder(double h, double r) {
		height = h;
		radius = r;
	}
	
	public double volumn() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public double surfaceArea() {
		return 2*Math.PI*radius*height + 2*Math.PI*Math.pow(radius, 2);
		
	}
}
