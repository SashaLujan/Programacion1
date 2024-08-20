package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario el ingreso de
dos números enteros (posiciones del arreglo) y ordene de forma
creciente el arreglo entre dos posiciones correspondientes a los
números ingresados.*/

public class ejercicioOrd37 {

	final static int MAX = 10;
	
	public static void main(String[] args) {

		int[] array = {1, 4, 13, 74, 5, 96, 0, 28, 9, 10 };
					// 0, 1,  2,  3, 4,  5, 6,  7, 8, 9
		int pos1 = obtenerEntero();
		int pos2 = obtenerEntero();

		mostrarArreglo(array);
		
		if((pos1>=0 && pos1<MAX)&&(pos2>=0 && pos2<MAX)) {
			ordCreciente(array, pos1, pos2);
			System.out.println("\narreglo ordenado entre la posicion " + pos1 + " y la posicion " + pos2);
			mostrarArreglo(array);
		}
		else
			System.out.println("las posiciones ingresadas no son validas");
		
	}
	
	public static void ordCreciente(int [] arr, int pos1, int pos2) {
		int temp;
		
		for(int i=pos1; i<pos2; i++) {
			for(int j=0; j<pos2-1; j++) {
				if (arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
			}
			
		}
	}
	
	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingresar un numero de posicion (entre 0 y 9)");
			num = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
		return num;
	}
	
	public static void mostrarArreglo(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
