package practico5;

/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor.*/

public class ejercicioSec24 {

	final static int MAX = 12;
	final static int SEP = 0;

	public static void main(String[] args) {

		int[] array = { 0, 4, 5, 6, 0, 0, 3, 6, 0, 4, 0, 0 };

		mostrarSecMayorSuma(array);
	}

	public static void mostrarSecMayorSuma(int[] array) {
		int inicio = 0;
		int fin = 0;
		int inicioSecMayor = 0;
		int finSecMayor = 0;
		int suma = 0;
		int sumaMayor = 0;

		while (inicio < MAX) {
			inicio = buscarInicio(array, fin + 1);
			if (inicio < MAX) {
				fin = buscarFin(array, inicio);

				suma = sumarSec(array, inicio, fin);

				if (sumaMayor < suma) {
					inicioSecMayor = inicio;
					finSecMayor = fin;
					sumaMayor = suma;
				}
			}
			
		}
		System.out.println("la posicion de la secuencia con mayor suma esta en: inicio: " + inicioSecMayor
					+ " fin: " + finSecMayor);
	}
	
	public static int sumarSec(int [] array, int inicio, int fin) {
		int suma = 0;
		while(inicio<=fin) {
			suma += array[inicio];
			inicio++;
		}
		
		return suma;
	}

	public static int buscarFin(int[] array, int inicio) {
		while (inicio < MAX && array[inicio] != SEP) {
			inicio++;
		}
		return inicio - 1;
	}

	public static int buscarInicio(int[] array, int inicio) {
		while (inicio < MAX && array[inicio] == SEP) {
			inicio++;
		}
		return inicio;
	}

}
