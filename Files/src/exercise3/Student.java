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
	
}