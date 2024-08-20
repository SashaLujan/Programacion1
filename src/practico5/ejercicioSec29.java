package practico5;

/*Hacer un programa que elimine de un arreglo todas las
secuencias que tienen orden descendente entre sus elementos.*/

public class ejercicioSec29 {

	final static int MAX = 20;
	
	public static void main(String[] args) {
		
		int [] array = {0,0,1,2,3,0,8,7,6,5,0,3,10,0,0,25,24,23,0,0};

		int inicio = 0;
		int fin = -1;
		
		mostrarArreglo(array);
		
		while(inicio<MAX) {
			inicio = buscarInicio(array, fin+1);
			if(inicio<MAX) {
				fin = buscarFin(array, inicio);
				if(esOrdenDesc(array,inicio,fin)) {
					comprimirSec(array,inicio,fin);
					fin = inicio;
				}
			}
		}
		
		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}
	
	public static void comprimirSec(int [] array, int inicio, int fin) {
		for(int i=inicio; i<=fin; i++) {
			correrIzq(array, inicio);
		}
	}
	
	public static void correrIzq(int [] array, int pos) {
		for(int i=pos; i<MAX-1; i++) {
			array[i] = array[i+1];
		}
	}
	
	public static boolean esOrdenDesc(int [] array, int inicio, int fin) {
		boolean esDesc = false;
		for(int i=inicio; i<=fin; i++) {
			if(array[inicio]>array[inicio+1]) {
				esDesc = true;
			}
		}
		
		return esDesc;
	}
	
	public static int buscarFin(int [] array, int inicio) {
		while(inicio<MAX && array[inicio]!=0) {
			inicio++;
		}
		return inicio-1;
	}
	
	public static int buscarInicio(int [] array, int inicio) {
		while(inicio<MAX && array[inicio]==0) {
			inicio++;
		}
		return inicio;
	}
	
	public static void mostrarArreglo(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
