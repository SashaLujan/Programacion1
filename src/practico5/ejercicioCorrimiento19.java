package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine todas las ocurrencia de número en el arreglo.
Mientras exista (en cada iteración tiene que buscar la posición
dentro del arreglo) tendrá que usar la posición para realizar un
corrimiento a izquierda (quedarán tantas copias de la última
posición del arreglo como cantidad de ocurrencias del número).*/

public class ejercicioCorrimiento19 {

	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 10 };
		int num = obtenerEntero();
		int pos = buscarPos(array,num);

		mostrarArreglo(array);
		
		eliminarOcurrencias(array,num, pos);

		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}

	public static void eliminarOcurrencias(int[]array, int num, int pos) {
		
		while(pos<MAX) {
			if(array[pos]==num) { // Eliminar ocurrencia y realizar corrimiento a izquierda
				corrimientoIzq(array,pos);
				array[MAX-1]=num; // Agregar una copia en la última posición
			}
			
			else {
				pos++;
			}
		}
	}
	
	public static int buscarPos(int[]array, int num) {
		int pos=0;
		
		while(pos<MAX && array[pos]!=num) {
			pos++;
		}
		
		return pos;
	}
	
	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

	public static void corrimientoIzq(int[] array, int pos) {
		for (int i = pos; pos < MAX - 1; pos++) {
			array[pos] = array[pos + 1];
		}
	}

	public static int obtenerEntero() {
		int num = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ingrese un número para eliminar todas sus ocurrencias en el arreglo:");
			num = Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}

		return num;
	}

}
