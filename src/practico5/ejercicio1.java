package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.**/

public class ejercicio1 {

	final static int MAX = 15;
	public static void main(String[] args) {
		int[] arr = new int [MAX];
		
		cargarArray(arr);
		mostrarArray(arr);
		
	}
	
	public static void mostrarArray ( int [] arr) {
		for(int pos = 0; pos < MAX; pos++) {
			System.out.print(arr[pos] + "|");
		}
	}
	
	public static void cargarArray (int [] arr) {
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		
		try {
			for(int pos = 0; pos < MAX; pos++) {
				System.out.println("ingrese un número en la posición: " + pos);
				arr[pos] = Integer.valueOf(entrada.readLine());
			
			}
		} catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
