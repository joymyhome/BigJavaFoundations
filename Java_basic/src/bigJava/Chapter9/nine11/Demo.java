package bigJava.Chapter9.nine11;

public class Demo {
	public static void main(String[] args) {
		Person person = new Person("New Start", 2018);
		Student student = new Student("New Start2", 2019, "CS");
		Instructor teacher = new Instructor("New Start3", 2020,1000000);
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
	}
}
