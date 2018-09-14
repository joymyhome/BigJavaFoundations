package bigJava.Chapter9.nine11;

public class Student extends Person{
	private String major;
	
	public Student(String n, int y, String m) {
		super(n, y);
		major = m;
	}
	
	public String toString() {
		
		return super.toString() +" Major is " + major;
	}
}
