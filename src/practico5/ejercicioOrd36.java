package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y elimine la primera ocurrencia de
número (un número igual) en el arreglo (si existe). Informar si no
existe en el arreglo.*/

public class ejercicioOrd36 {
	
	final static int MAX = 10;

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int num = obtenerEntero();
		int pos = obtenerPosOrdCreciente(array, num); //busco la posicion del numero ingresado
		
		mostrarArreglo(array);
		
		if(pos<MAX && array[pos]==num) {
			System.out.println("\nel numero " + num + " se encontro en la posicion: " + pos);
			correrIzq(array,pos);
		}
		else
			System.out.println("\nel numero " + num + " no se encontro en el arreglo");
		
		System.out.println("\narreglo modificado: ");
		mostrarArreglo(array);
	}
	
	public static int obtenerPosOrdCreciente(int [] array, int num) {
		int pos = 0;
		
		while(pos<MAX && array[pos]<num) {
			pos++;
		}
		
		return pos;
	}
	
	public static void correrIzq(int [] array, int pos) {
		for(int i=pos; i<MAX-1; i++) {
			array[i] = array[i+1];
		}
	}
	
	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingresar un numero para eliminar en el arreglo");
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
