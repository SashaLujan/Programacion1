package practico5;

/*Hacer un programa que reemplace de un arreglo A todas las
ocurrencias de una secuencia patrón dada en un arreglo P, por la
secuencia contenida en el arreglo R de igual tamaño.*/

public class ejercicioSec30 {

	final static int MAX_A = 20;
	final static int MAX_P = 3;
	final static int MAX_R = 3;
	
	public static void main(String[] args) {
	
		int [] arrayA = {0,0,1,2,3,0,8,7,6,5,0,3,10,0,0,1,2,3,0,0};
		int [] arrayP = {1,2,3};
		int [] arrayR = {22,7,4};
		
		int inicio = 0;
		int fin = -1;
		
		mostrarArreglo(arrayA);
		
		//recorrer el arreglo A secuencia a secuencia
		while(inicio<MAX_A) {
			inicio = buscarInicio(arrayA,fin+1);
			if(inicio<MAX_A) {
				fin = buscarFin(arrayA,inicio);
				//si la secuencia es un patron
				if(esPatron(arrayA,inicio,fin,arrayP)) {
					//cambio la secuencia patron por la secuencia del arreglo R del mismo tamanio
					reemplazarSec(arrayA,inicio,fin,arrayR);
					
				}
			}
		}
		
		System.out.println("\narreglomodificado:");
		mostrarArreglo(arrayA);
	}
	
	public static void reemplazarSec(int [] arrayA, int inicio, int fin, int [] arrayR) {
		for(int i=0;i<MAX_R;i++) {
			arrayA[inicio+i]=arrayR[i];
		}
	}
	
	public static boolean esPatron(int [] arrayA, int inicio, int fin, int [] arrayP) {
		int tamA=fin-inicio+1;
		int tamP=MAX_P;
		int inicioP=0;
		
		if(tamA==tamP) {
			while(inicio<inicioP && arrayA[inicio]==arrayP[inicioP]) {
				inicio++;
				inicioP++;
			}
			return inicio>inicioP;
		}
		else
			return false;
	}
	
	public static int buscarFin(int [] arrayA, int inicio) {
		while(inicio<MAX_A && arrayA[inicio]!=0) {
			inicio++;
		}
		return inicio-1;
	}
	
	public static int buscarInicio(int [] arrayA, int inicio) {
		while(inicio<MAX_A && arrayA[inicio]==0) {
			inicio++;
		}
		return inicio;
	}
	
	public static void mostrarArreglo(int [] arrayA) {
		for(int i=0; i<MAX_A; i++) {
			System.out.print(arrayA[i] + "|");
		}
	}
}
