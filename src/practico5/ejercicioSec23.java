package practico5;

/*Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros.*/

public class ejercicioSec23 {

	final static int MAX = 12;
	final static int SEP = 0;
	
	public static void main(String[] args) {
		
		int [] array = {0,4,5,6,0,0,3,6,0,4,0,0};

		int inicio = 0;
		int fin = -1;
		int primerSec = 0;
	
		while(inicio<MAX && primerSec!=1) {
			inicio = buscarInicio(array, fin+1);
			if(inicio<MAX) {
				fin = buscarFin(array, inicio);
				primerSec++;
				System.out.println("las posiciones de la primera secuencia son: -inicio: " + inicio + " -fin: " + fin);
			}
		}
		
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

}
