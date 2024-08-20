package practico5;

/*Hacer un programa que invierta el orden de la última secuencia
en un arreglo.*/

public class ejercicioSec31 {

	final static int MAX = 20;
	
	public static void main(String[] args) {
		
		int [] array = {0,0,1,2,3,0,8,7,6,5,0,3,10,0,0,14,22,39,0,0};
		
		int inicio = MAX-1;
		int fin = MAX;
		int cantSec = 0;
		
		mostrarArreglo(array);
		
		while(inicio>0 && cantSec<1) {
			inicio = buscarInicio(array, fin-1);
			if(inicio>0) {
				fin = buscarFin(array, inicio);
				cantSec++;
			}
		}
		if(cantSec==1) {
			invertirOrdenSec(array, inicio, fin);
		}
		
		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}
	
	public static void invertirOrdenSec(int [] array, int inicio, int fin) {
		int aux=0;
		
		while(fin<inicio) {
			aux = array[fin];
			array[fin] = array[inicio];
			array[inicio] = aux;
			
			fin++;
			inicio--;
		}
	}
	
	public static int buscarFin(int [] array, int inicio) {
		while(inicio>0 && array[inicio]!=0) {
			inicio--;
		}
		return inicio+1;
	}
	
	public static int buscarInicio(int [] array, int inicio) {
		while(inicio>0 && array[inicio]==0) {
			inicio--;
		}
		return inicio;
	}
	
	public static void mostrarArreglo(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
