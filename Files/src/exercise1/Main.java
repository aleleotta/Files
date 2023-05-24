package exercise1;
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner read = null;
		try {
			read = new Scanner(new FileReader("src\\files\\Random_double_numbers.txt"));
			int sum = 0;
			double average = 0;
			int counter = 0;
			while(read.hasNext()) {
				int num = read.nextInt();
				System.out.print(num + " ");
				sum = sum + num;
				counter++;
			}
			average = sum / counter;
			System.out.println("\n\nSum = " + sum);
			System.out.println("Average = " + average);
		} catch (FileNotFoundException err) {
			System.out.println("\"Random_double_numbers\"" + " is missing!");
			System.out.println(err.getMessage());
		} finally {
			if(read != null) {
				read.close();
			}
		}
	}
}				

/*
Crea con un editor el fichero de texto NumerosReales.txt en la carpeta del proyecto.
Escribe en él una serie de números reales separados por espacios simples.
Implementar un programa que acceda a NumerosReales.txt,
lea los números y calcule la suma y la media aritmética, mostrando los resultados por pantalla.
*/