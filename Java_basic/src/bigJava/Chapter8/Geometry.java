package bigJava.Chapter8;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {
	
	/**
    Computes the perimeter of an ellipse.
    (Note: There is no closed formula for the exact value; see
    http://mathworld.wolfram.com/Ellipse.html. There are several
    formulas for approximations, but they aren't all that good. 
    We compute the value using the Gauss-Kummer series.) 
    @param e the ellipse
    @return the perimeter of the ellipse      
  */
 public static double perimeter(Ellipse2D.Double e)
 {
    double a = e.getWidth() / 2;
    double b = e.getHeight() / 2;
    double EPSILON = 1E-12;

    double h = (a - b)/(a + b);
    h = h * h;
    double sum = 0;      
    double coeff = 1;
    double power = 1;
    double n = 0;
    double term = 1;
    while (term > EPSILON)
    {
       sum = sum + term;
       n++;
       double factor = (0.5 - n + 1) / n;
       coeff = coeff * factor * factor;         
       power = power * h;
       term = coeff * power;
    }

    return Math.PI * (a + b) * sum;
 }
	
	/**
	 * Calculate the area of the ellipse e
	 * @param e the ellipse 
	 * @return the area of the ellipse
	 */
	public static double area(Ellipse2D.Double e) {
		double a = e.width/2;
		double b = e.height/2;
		return Math.PI*a*b;
	}
	
	/**
	 * Compute the angle between the x-axis and the line joining two points
	 * @param p point 1 
	 * @param q point 2
	 * @returnthe angle
	 */
	public static double angle(Point2D.Double p, Point2D.Double q) {
		//assert !p.equals(q); //出现NaN
		double hd = Math.abs(p.y - q.y);
		double wd = Math.abs(p.x - q.x);
		double tan = hd/wd;
		double degree = 180*Math.atan(tan)/Math.PI;
		return degree;
	}
	
	/**
	 * Compute the slope of the line joining point p and point q
	 * @param p
	 * @param q
	 * @return the slope of the line
	 */
	public static double slope(Point2D.Double p, Point2D.Double q) {
		double hd = Math.abs(p.y - q.y);
		double wd = Math.abs(p.x - q.x);
		double s = hd/wd;
		return s;
	}
}
