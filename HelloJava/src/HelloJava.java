import org.softuni.data.Student;


public class HelloJava {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println("Hello Java!");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		printName("Nakov");
	}

	private static void printName(String name) {
		System.out.println("My name is:" + name);
		
	}

}
