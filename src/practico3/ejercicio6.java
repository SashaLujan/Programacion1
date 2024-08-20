/**
 * 
 */
package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que mientras el usuario cargue desde teclado un carácter
 * letra minúscula, llame a un método que imprime por pantalla la tabla de
 * multiplicar del 9.
 */
public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = obtenerCaracter();

		
	}

	private static void imprimirTabla9() {
		System.out.println("tabla del 9");
		for (int i = 1; i < 10; i++) {
			System.out.println(9 * i);
		}

	}

	public static char obtenerCaracter() {

		char caracter = 'a';

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (caracter >= 'a' && caracter <= 'b') {
			try {
				System.out.println("ingresar un caracter minuscula");
				caracter = entrada.readLine().charAt(0);
				
				imprimirTabla9();

			} catch (Exception exc) {
				System.out.println(exc);
			}

			
		}
		return caracter;

	}
}
