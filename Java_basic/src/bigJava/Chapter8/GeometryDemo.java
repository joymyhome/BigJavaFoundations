package bigJava.Chapter8;

import java.awt.geom.Point2D;

public class GeometryDemo {
	public static void main(String[] args) {
		Point2D.Double p1 = new Point2D.Double(1.0, 1.0);
		Point2D.Double p2 = new Point2D.Double(0, 0);
		
		System.out.println(Geometry.angle(p1, p2));
		
	}
}
