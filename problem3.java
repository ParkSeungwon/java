//2016110056 박승원

class Dog {
	private String name;
	public String breed;
	private int age;

	String getName() { return name; }
	void setName(String name) { this.name = name; }
	int getAge() { return age; }
	void setAge(int age) { this.age = age; }
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = null;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
}

public class problem3
{
	static public void main(String[] args) {
		Dog d = new Dog("멍멍이", "진돗개", 3);
		d.setAge(5);
	}
}
