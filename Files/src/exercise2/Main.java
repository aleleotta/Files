package exercise2;
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner read = null;
		try {
			read = new Scanner(new FileReader("src\\files\\Integers.txt"));
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
Crear con un editor el fichero de texto Enteros.txt en la carpeta del proyecto y
escribe en él una serie de números enteros separados por secuencias de espacios y tabuladores,
incluso en líneas distintas, tal como:

2	3  45		73
  123		4   21

Implementar un programa que acceda a Enteros.txt con un objeto Scanner a través de un flujo de entrada,
lea los números y calcule la suma y la media aritmética, mostrando los resultados por pantalla.
*/