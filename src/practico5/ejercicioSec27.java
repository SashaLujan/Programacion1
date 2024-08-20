package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un número N ingresado por el
usuario, elimine las secuencias de tamaño N de números distintos
de cero.*/

public class ejercicioSec27 {

	final static int MAX = 12;
	final static int SEP = 0;
	
	public static void main(String[] args) {
		
		int[] array = { 0, 4, 5, 6, 0, 8, 3, 6, 0, 4, 0, 0 };
		
		int N = obtenerEntero();
		
		mostrarArreglo(array);		
		eliminarSec(array, N);
		
		System.out.println("\narreglo modificado: ");
		mostrarArreglo(array);
	}
	
	public static void eliminarSec(int [] array, int N) {
		
		int inicio = 0;
		int fin = -1;
		int tamSec = 0;
		
		while(inicio<MAX) {
			inicio = buscarInicio(array, fin+1);
			
			if(inicio<MAX) {
				fin = buscarFin(array, inicio);
				tamSec = contarTamSec(array, inicio, fin);
				
				if(tamSec == N) {
					comprimirSec(array, inicio, fin);
					fin = inicio;
				}
				
			}
			tamSec=0;
		}
	}
	
	public static void comprimirSec(int [] array, int inicio, int fin) {
		for(int i=inicio; i<=fin; i++) {
			corrimientoIzq(array,inicio);
		}
	}
	
	public static void corrimientoIzq(int [] array, int pos) {
		for(int i=pos; i<MAX-1;i++) {
			array[i] = array[i+1];
		}
	}
	
	public static int contarTamSec(int [] array, int inicio, int fin) {
		int tam = 0;
		
		for(int i = inicio; i<=fin; i++) {
			tam++;
		}
		return tam;
	}
	
	public static int buscarFin(int [] array, int inicio) {
		while(inicio<MAX && array[inicio]!=SEP) {
			inicio++;
		}
		return inicio-1;
	}
	
	public static int buscarInicio(int [] array, int inicio) {
		while(inicio<MAX && array[inicio]==SEP) {
			inicio++;
		}
		return inicio;
	}
	
	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un numero para eliminar una secuencia");
			num = Integer.valueOf(entrada.readLine());
		} catch(Exception exc) {
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
