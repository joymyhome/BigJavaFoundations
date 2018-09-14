package bigJava.Chapter9.nine12;

public class Executive extends Manager{
	
/**
    Construct a Executive object.
    @param n the name of the Executive
    @param s the salary of the Executive
    @param d the department where the Executive works
 */
	public Executive(String n, double s, String d) {
		super(n, d, s);
	}
	
	public String toString() {
		return "Executive: " + super.toString();
	}

}
