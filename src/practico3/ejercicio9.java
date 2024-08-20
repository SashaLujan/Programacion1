package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el carácter corresponde a un número;
d. “otro” para los restantes casos de caracteres.*/

public class ejercicio9 {
	public static void main(String[] args) {
		int num = obtenerNum();
		
		while(num>=1 && num<=10) {
			char caracter = ingresarCaracter();
			
			if(caracter>='a' && caracter<='z') {
				System.out.println("letra minuscula");
			}
			else if(caracter>='A' && caracter<='Z') {
				System.out.println("letra mayuscula");
			}
			else if(caracter>='0' && caracter<='9') { 
				System.out.println("digito");
			}
			else
				System.out.println("otro");
			
			num = obtenerNum();
		}
	}

	/**
	 * @return
	 */
	private static int obtenerNum() {
		int num = 0;
		boolean esValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!esValido) { 
			try {
				System.out.println("ingrese un numero entero entre 1 y 10");
				num = Integer.valueOf(entrada.readLine());
				
				esValido = true;
				//ingresarCaracter();

			} catch (Exception exc) {
				System.out.println(exc);
			}
		}
		return num;
	}

	/**
	 * 
	 */
	private static char ingresarCaracter() {
		// TODO Auto-generated method stub
		char letra = ' ';

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("ingrese una letra");
			letra = entrada.readLine().charAt(0);
			//System.out.println(letra);
		} catch (Exception exc) {
			System.out.println(exc);
		}
		return letra;
	}
}
