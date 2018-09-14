package bigJava.Chapter9.nine12;
//Implementing a manager class
public class Manager extends Employee{
	private String department;
	
	public Manager(String n, String d, double s) {
		super(n, s);
		department = d;
	}
	/**
	 *  Prints the manager’s name, department, and salary.
	 */
	public String toString() {
		return "Manager :  " + super.toString() + ", Department: "+ department;
	}

}
