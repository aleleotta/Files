package exercise5;
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		Scanner reader = null;
		try {
			reader = new Scanner(new FileReader("src\\files\\Data.txt"));
			if(reader.hasNext()) {
				writer = new FileWriter("src\\files\\Data.txt", true);
			} else {
				writer = new FileWriter("src\\files\\Data.txt");
			}
			String name = "";
			int age = 0;
			System.out.print("Please introduce your full name: ");
			name = sc.nextLine();
			System.out.print("Please introduce your age: ");
			age = sc.nextInt();
			writer.write("Name: " + name + "\nAge: " + age);
			writer.flush();
		} catch (IOException err) {
			System.out.println("Something has gone wrong!");
			err.getMessage();
		} finally {
			try {
				writer.close();
				reader.close();
			} catch (IOException err) {
				System.out.println("An error has occured when releasing resources.");
				err.getMessage();
			}
		}
		sc.close();
	}
}

/*
Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero datos.txt.
Si este fichero existe, deben añadirse al final en una nueva línea, y en caso de no existir, debe crearse.
*/