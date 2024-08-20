/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * escribir un programa que declare una variable de tipo double y una constante de tipo double con valor 1.0
 * luego deberá asignar el doble del valor de la constante a la variable y mostrar ambos por pantalla.
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double valor = 1.0;
		double valor2 = valor*2;
		
		System.out.println("valo constante: " + valor + "\n valor variable: " + valor2);
	}

}
