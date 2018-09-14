package bigJava.Chapter9.nine12;
// Implementing problem
public class Employee {
	private String name;
	private double salary;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String toString() {
		return "Name : "+ name + ", Salary = " + salary;
	}
}
