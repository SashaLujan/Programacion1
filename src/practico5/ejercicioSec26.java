package practico5;

/*Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño.*/

public class ejercicioSec26 {

	final static int MAX = 12;
	final static int SEP = 0;
	public static void main(String[] args) {
		
		int[] array = { 0, 4, 5, 6, 0, 0, 3, 6, 0, 4, 0, 0 };

		mostrarSecMayorTam(array);
	}
	
	public static void mostrarSecMayorTam(int [] array) {
		int inicio = 0;
		int fin = -1;
		int inicioSecMayor = 0;
		int finSecMayor = 0;
		int tam = 0;
		int mayorTam = 0;
		
		while(inicio<MAX) {
			inicio = buscarInicio(array, fin+1);
			if(inicio<MAX) {
				fin = buscarFin(array, inicio);
				tam = sumarTamanio(array, inicio, fin);
				
				if(mayorTam<tam) {
					inicioSecMayor = inicio;
					finSecMayor = fin;
					mayorTam = tam;
				}
			}
		}
		
		System.out.println("la secuencia de mayor tamanio esta en la posicion: inicio: " + inicioSecMayor + " fin: " + finSecMayor);
	}
	
	public static int sumarTamanio(int [] array, int inicio, int fin) {
		int suma = 0;
		
		for(int i = inicio; i<= fin; i++) {
			suma++;
		}
		
		return suma;
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
}
