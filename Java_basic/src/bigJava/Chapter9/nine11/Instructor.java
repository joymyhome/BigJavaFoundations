package bigJava.Chapter9.nine11;

public class Instructor extends Person{
	private double salary;
	
	public Instructor(String n, int year, double s) {
		super(n, year);
		salary = s;
	}
	
	public String toString() {
		
		return super.toString() +" Salary is " + salary;
	}
}
