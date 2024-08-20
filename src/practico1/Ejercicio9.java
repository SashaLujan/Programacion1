/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el cociente de la división de dicho número
por 2, 3, y 4. En base a los resultados obtenidos analice cada
caso si es correcto o no.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un número entero");
			num = Integer.valueOf(entrada.readLine());
			System.out.println("cociente de la división entre el número ingresado y 2 " + (num/2));
			System.out.println("cociente de la división entre el número ingresado y 3 " + (num/3));
			System.out.println("cociente de la división entre el número ingresado y 4 " + (num/4));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
