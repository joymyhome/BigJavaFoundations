package bigJava.Chapter9.nine12;

public class Demo {
	
	public static void main(String[] args) {
		Employee em = new Employee("Future", 1000000);
		Executive ex = new Executive("Future2", 1000001, "Sales");
		Manager ma = new Manager("Future2", "Marketing", 1000002);
		
		System.out.println(em);
		System.out.println(ex);
		System.out.println(ma);
	}
	
	
}
