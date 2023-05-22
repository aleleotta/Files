package exercise1;
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new FileReader("C:\\Users\\aleleotta\\Desktop\\IES Nervion\\PROG\\Files\\Random Double Numbers"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		//C:\Users\aleleotta\Desktop\IES Nervion\PROG\Files
		
	}
}

/*
Crea con un editor el fichero de texto NumerosReales.txt en la carpeta del proyecto.
Escribe en él una serie de números reales separados por espacios simples.
Implementar un programa que acceda a NumerosReales.txt,
lea los números y calcule la suma y la media aritmética, mostrando los resultados por pantalla.
*/