package exercise3;
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("src\\files\\Students.txt"));
		} catch (FileNotFoundException err) {
			err.getMessage();
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