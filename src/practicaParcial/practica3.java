package practicaParcial;

public class practica3 {

	final static int MAX_A = 41;
	final static int MAX_S = 20;
	final static char SEP = ' ';
	final static char SEP1 = '.';
	final static char SEP2 = ',';
	
	public static void main(String[] args) {
			
		char [] arrayA = {' ','l','a',' ','c','a','s','a',' ','r','o','j','a',',',' ','a',' ','l','a',' ','v','u','e','l','t','a',' ','d','e',' ','l','a',' ','e','s','q','u','i','n','a','.'};
		char [] arrayS = {' ','a',' ','l','o',' ','l','o','s',' ','d','e',' ','l','a',' ','l','a','s',' '};
		
		int inicio = 0;
		int fin = -1;
				
		mostrarArreglo(arrayA);
		
		while(inicio<MAX_A) {
			inicio = buscarInicio(arrayA, fin+1);
			if(inicio<MAX_A) {
				fin = buscarFin(arrayA, inicio);
				//si la secuencia es una stopword
				if(esStopword(arrayA,inicio,fin,arrayS)) {
					eliminarSec(arrayA,inicio,fin);
					fin = inicio; //mofidico el fin para buscar la prox secuencia
				}
			}
		}
		
		System.out.println("\narreglo modificado: ");
		mostrarArreglo(arrayA);
		
	}
	
	public static void eliminarSec(char [] arrayA, int inicio, int fin) {
		for(int i=inicio; i<=fin; i++) {
			correrIzq(arrayA,inicio);
		}
	}
	
	public static void correrIzq(char [] arrayA, int pos) {
		for(int i=pos; i<MAX_A-1; i++) {
			arrayA[i]=arrayA[i+1];
		}
	}
	
	public static boolean esStopword(char [] arrayA, int inicioA, int finA, char [] arrayS) {
		int inicioS = 0;
		int finS = -1;
		boolean encontreSecIgual = false;
		
		while(inicioS<MAX_S && !encontreSecIgual) {
			inicioS = buscarInicioS(arrayS,finS+1);
			if(inicioS<MAX_S) {
				finS = buscarFinS(arrayS,inicioS);
				
				//si la secuencia es igual a la secuencia pasada por parametro
				if(secIguales(arrayA,inicioA,finA,arrayS,inicioS,finS)) {
					encontreSecIgual = true;
				}
			}
		}
		
		return encontreSecIgual;
	}
	
	public static boolean secIguales(char [] arrayA, int inicioA, int finA, char [] arrayS, int inicioS, int finS) {
		int tamA = finA-inicioA+1;
		int tamS = finS-inicioS+1;
		
		if(tamA==tamS ) { //si el tamanio es igual me fijo si el contenido de la secuencias son iguales
			while(inicioA<=finA && arrayA[inicioA]==arrayS[inicioS]) {
				inicioA++;
				inicioS++;
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
	
	public static int buscarFinS(char [] arrayS, int inicio) {
		while(inicio<MAX_S && arrayS[inicio]!=SEP) {
			inicio++;
		}
		return inicio-1;
	}
	
	public static int buscarInicioS(char [] arrayS, int inicio) {
		while(inicio<MAX_S && arrayS[inicio]==SEP) {
			inicio++;
		}
		return inicio;
	}
	
	public static int buscarFin(char [] arrayA, int inicio) {
		while(inicio<MAX_A && (arrayA[inicio]!=SEP && arrayA[inicio]!=SEP1 && arrayA[inicio]!=SEP2)) {
			inicio++;
		}
		return inicio-1;
	}
	
	public static int buscarInicio(char [] arrayA, int inicio) {
		while(inicio<MAX_A && (arrayA[inicio]==SEP|| arrayA[inicio]==SEP1 || arrayA[inicio]==SEP2)) {
			inicio++;
		}
		return inicio;
	}
	
	public static void mostrarArreglo(char [] arrayA) {
		for(int i=0; i<MAX_A; i++) {
			System.out.print(arrayA[i] + "|");
		}
	}

}
