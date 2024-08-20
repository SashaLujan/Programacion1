/**
 * 
 */
package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un dise�o de programa que mientras que el usuario ingrese un n�mero
 * distinto de 0, pida ingresar otro n�mero y lo imprima.
 */
public class ejercicio1 {

	public static void main(String[] args) {
		
		int num = obtenerEntero();
		
		
	}

	private static int obtenerEntero() {
		
		int num = 1;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		while(num != 0) {
			try {
				System.out.println("ingrese un numero entero distinto a 0");
				num = Integer.valueOf(entrada.readLine());
				System.out.println("numero ingresado " + num);
			} catch (Exception exc){
				System.out.println("error " + exc);
			}
		}
		
		return num;
	}

}
