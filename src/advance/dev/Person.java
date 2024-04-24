package advance.dev;

public class Person {
	private String name; // Thuộc tính Name
	private int age; // Thuộc tính Age

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Phương thức getter cho thuộc tính Name
	public String getName() {
		return name;
	}

	// Phương thức setter cho thuộc tính Name
	public void setName(String name) {
		this.name = name;
	}

	// Phương thức getter cho thuộc tính Age
	public int getAge() {
		return age;
	}

	// Phương thức setter cho thuộc tính Age
	public void setAge(int age) {
		this.age = age;
	}
}
