package bigJava.Chapter9.nine11;
//Superclass Person

public class Person {
	private String name;
	private int birthYear;
	
	public Person(String n, int year) {
		name = n;
		birthYear = year;
	}
	@Override
	public String toString() {
		return  "name: " + name + " Year of birth: " + birthYear + "\n";
	}
}
