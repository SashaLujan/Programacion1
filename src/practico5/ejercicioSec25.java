package practico5;

/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.*/

public class ejercicioSec25 {

	final static int MAX = 12;
	final static int SEP = 0;
	
	public static void main(String[] args) {

		int[] array = { 0, 4, 5, 6, 0, 0, 3, 6, 0, 4, 0, 0 };

		mostrarAnteultimaSec(array);
	}
	
	public static void mostrarAnteultimaSec(int [] array) {
		int inicio = MAX-1;
		int fin = MAX;
		int contSec = 0;
		
		while(inicio>0 && contSec<2) {
			inicio = buscarInicio(array, fin-1);
			if(inicio>0) {
				fin = buscarFin(array, inicio);
				contSec++;
			}
		}
		if(contSec==2)
			System.out.println("la posicion de la anteultima secuencia es: inicio: " + fin + " fin: " + inicio);
	}
	
	public static int buscarFin(int [] array, int inicio) {
		while(inicio>0 && array[inicio]!= SEP) {
			inicio--;
		}
		return inicio+1;
	}
	
	public static int buscarInicio(int [] array, int inicio) {
		while(inicio>0 && array[inicio]== SEP) {
			inicio--;
		}
		return inicio;
	}

}
