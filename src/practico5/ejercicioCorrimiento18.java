package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).*/

public class ejercicioCorrimiento18 {

	final static int MAX = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {1,2,3,88,6,7,8,9,5,9};
		int num = obtenerEntero();
		int pos = buscarPos(array, num);
		
		mostrarArreglo(array);
		
		if(array[pos]==num) {
			corrimientoIzq(array, pos);
		}
		
		System.out.println("\narreglo modificado");
		mostrarArreglo(array);
	}
	
	public static void mostrarArreglo(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	public static void corrimientoIzq(int []array, int pos) {
		for (int i = pos; pos < MAX - 1; pos++) {
			array[pos] = array[pos + 1];
		}
	}
	
	public static int buscarPos(int []array, int num) {
		int pos = 0;
		
		while(pos<MAX && array[pos]!=num) {
			pos++;
		}
		return pos;
	}

	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un numero entero para eliminar en el arreglo");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
			System.out.println(exc);
		}
		
		return num;
	}
}
