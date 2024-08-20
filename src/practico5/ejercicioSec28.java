package practico5;

/*Hacer un programa que elimine de un arreglo todas las
ocurrencias de una secuencia patrón dada por otro arreglo.*/

public class ejercicioSec28 {
	
	final static int MAX_A = 15;
	final static int MAX_B = 2;

	public static void main(String[] args) {
		int [] arrayA = {0,1,2,0,2,0,4,5,0,1,2,0,6,7,0};
		int [] arrayB = {4,5};

		int inicioA = 0;
		int finA = -1;
		
		mostrarArreglo(arrayA);
		
		while (inicioA<MAX_A) {
			inicioA = buscarInicioA(arrayA,finA+1);
			if(inicioA<MAX_A) {
				finA = buscarFinA(arrayA,inicioA);
				if(esPatron(arrayA,inicioA,finA,arrayB)) {
					eliminarOcurrencia(arrayA,inicioA,finA);
					finA = inicioA;
				}
			}
		}
		
		System.out.println("\narreglo modificado: ");
		mostrarArreglo(arrayA);
	}
	
	public static void eliminarOcurrencia(int [] arrayA, int inicioA, int finA) {
		for(int i=inicioA; i<=finA; i++) {
			correrIzq(arrayA,inicioA);
		}
	}
	
	public static void correrIzq(int [] arrayA, int pos) {
		for(int i=pos; i<MAX_A-1; i++) {
			arrayA[i] = arrayA[i+1];
		}
	}
	
	public static boolean esPatron(int [] arrayA, int inicioA, int finA, int [] arrayB) {
		int inicioB = 0;
		int finB = -1;
		boolean hayPatron = false;
		
		while(inicioB<MAX_B && !hayPatron) {
			inicioB = buscarInicioB(arrayB, finB+1);
			
			if(inicioB<MAX_B) {
				finB = buscarFinB(arrayB, inicioB);
				
				if(encontrePatron(arrayA,inicioA,finA,arrayB,inicioB,finB)) {
					hayPatron = true;
				}
			}
		}
		return hayPatron;
	}
	
	public static boolean encontrePatron(int[] arrayA, int inicioA, int finA, int[] arrayB, int inicioB, int finB) {
		
		int tamA = finA-inicioA+1;
		int tamB = finB-inicioB+1;
		
		if(tamA==tamB) {
			while(inicioA<=finA && arrayA[inicioA]==arrayB[inicioB]) {
				inicioA++;
				inicioB++;
			}
			if(inicioA<=finA) {
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public static int buscarFinB(int [] arrayB, int inicioB) {
		while(inicioB<MAX_B && arrayB[inicioB]!=0) {
			inicioB++;
		}
		return inicioB-1;
	}
	
	public static int buscarInicioB(int [] arrayB, int inicioB) {
		while(inicioB<MAX_B && arrayB[inicioB]==0) {
			inicioB++;
		}
		return inicioB;
	}

	public static int buscarFinA(int [] arrayA, int inicioA) {
		while(inicioA<MAX_A && arrayA[inicioA]!=0) {
			inicioA++;
		}
		return inicioA-1;
	}
	
	public static int buscarInicioA(int [] arrayA, int inicioA) {
		while(inicioA<MAX_A && arrayA[inicioA]==0) {
			inicioA++;
		}
		return inicioA;
	}
	
	public static void mostrarArreglo(int [] arrayA) {
		for(int i=0; i<MAX_A; i++) {
			System.out.print(arrayA[i] + "|");
		}
	}

}
