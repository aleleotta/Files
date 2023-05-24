package exercise4;
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String sentence = "";
		try {
			writer = new FileWriter("src\\files\\Random lines.txt");
			System.out.println("Type END whenever you wanna stop writing things.");
			while(!sentence.equalsIgnoreCase("end")) {
				System.out.print("Write something: ");
				sentence = sc.nextLine();
				if(!sentence.equalsIgnoreCase("end")) {
					writer.write(sentence + "\n");
					writer.flush();
				}
			}
		} catch (IOException err) {
			System.out.println("Something has gone wrong!");
			err.getMessage();
		} finally {
			try {
				writer.close();
			} catch (IOException err) {
				err.getMessage();
			}
		}
		sc.close();
	}
}

/*
Escribe un texto en un archivo de texto, línea a línea leídas de teclado,
hasta que se introduzca la cadena “fin”.
*/
