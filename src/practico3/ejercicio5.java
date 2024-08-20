/**
 * 
 */
package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hacer un método que dado un número entero con valor inicial 1, haga una
 * iteración incrementando el número de a uno hasta un valor MAX = 4
 * (constante). Mientras itera deberá imprimir el número. Luego invocarlo desde
 * el programa principal y cuando termina, imprimir por pantalla “terminó”.
 */
public class ejercicio5 {

	final static int MAX = 4;

	public static void main(String[] args) {
		
		/**/
		
		
		//int num = 1;
		//System.out.println("comienza interacion" );
		incrementarEntero();
		System.out.println("termino");

	}

	public static void incrementarEntero() {
			
		for(int i = 1; i<MAX; i++) {
			//i++;
			System.out.println(i);
		}
		
	}
}
