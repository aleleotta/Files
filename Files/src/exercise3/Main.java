package exercise3;
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = null;
		Student per;
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			sc = new Scanner(new FileReader("src\\files\\Students.txt"));
			String name = "";
			int age = 0;
			double height = 0;
			int counter = 0;
			int averageAge = 0;
			double averageHeight = 0;
			int sumAge = 0;
			double sumHeight = 0;
			while(sc.hasNextLine()) {
				name = sc.next();
				age = sc.nextInt();
				height = sc.nextDouble();
				per = new Student(name, age, height);
				studentList.add(per);
				counter++;
			}
			for(Student p: studentList) {
				System.out.println("=====================================================================================");
				System.out.println("Name: " + p.getName());
				System.out.println("Age: " + p.getAge());
				System.out.println("Height: " + p.getHeight());
				sumAge = sumAge + p.getAge();
				sumHeight = sumHeight + p.getHeight();
			}
			averageAge = sumAge / counter;
			averageHeight = sumHeight / counter;
			System.out.println("=====================================================================================");
			System.out.println("=====================================================================================");
			System.out.println("Age average: " + averageAge);
			System.out.println("Height average: " + averageHeight);
		} catch (FileNotFoundException err) {
			err.getMessage();
		} finally {
			sc.close();
		}
	}
}

/*
Crea con un editor el fichero de texto Alumnos.txt en la carpeta del proyecto y escribe en él los nombres,
edades y estaturas de los alumnos de un grupo, cada uno en una línea:

	juan 22 1.77
	luis 21 1.80
	pedro 20 1.73
	…

Implementa un programa que lea del fichero los datos,
muestre los nombres y calcule la media de la edad y de las estaturas, mostrándolas por pantalla.
*/