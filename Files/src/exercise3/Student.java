package exercise3;

public class Student {
	private String name = "";
	private int age = 0;
	private double height = 0;
	
	public Student(String name, int age, double height) {
		if(name != "" && age > 0 && height > 0) {
			this.name = name;
			this.age = age;
			this.height = height;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}