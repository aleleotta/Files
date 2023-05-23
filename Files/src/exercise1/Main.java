package exercise1;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader("C:\\Users\\aleleotta\\Desktop\\IES Nervion\\PROG\\Files"));
		} catch (FileNotFoundException err) {
			err.printStackTrace();
		} finally {
			try {
				read.close();
			} catch (IOException err) {
				err.printStackTrace();
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