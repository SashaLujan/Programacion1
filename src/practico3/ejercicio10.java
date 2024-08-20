package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Escribir un programa que mientras el usuario ingrese un número entero entre 1 y 10 realice:
a. Si el numero ingresado es múltiplo de 3 pida ingresar un caracter y para el caracter ingresado 
imprima a qué tipo de carácter está asociado:
i. “letra minúscula” si el carácter es una letra del abecedario en minúscula;
ii. “letra mayúscula” si el carácter es una letra del abecedario en mayúscula;
iii. “dígito” si el carácter corresponde a un número;
iv. “otro” para los restantes casos de caracteres.
b. Si el número ingresado es múltiplo de 5 imprima la tabla de
multiplicar del número ingresado.*/

public class ejercicio10 {

	public static void main(String[] args) {

		int num = obtenerEntero();

		while (num >= 1 && num <= 10) {
			if ((num % 3) == 0) {
				tipoDeCaracter(ingresarCaracter());
			} else if ((num % 5) == 0) {
				tablaDeMultiplicar(num);
			}
			num = obtenerEntero();
		}
	}

	public static void tablaDeMultiplicar(int num) {
		System.out.println("table del " + num);
		for (int i = 1; i < 10; i++) {
			System.out.println(num * i);
		}
	}

	/**
	 * @param caracter
	 */
	public static void tipoDeCaracter(char caracter) {

		if (caracter >= 'a' && caracter <= 'z') {
			System.out.println("letra minuscula");
		} else if (caracter >= 'A' && caracter <= 'Z') {
			System.out.println("letra mayuscula");
		} else if (caracter >= '0' && caracter <= '9') {
			System.out.println("digito");
		} else
			System.out.println("otro");

	}

	/**
	 * 
	 */
	public static char ingresarCaracter() {
		char caracter = ' ';

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
		} catch (Exception exc) {
			System.out.println(exc);
		}

		return caracter;
	}

	public static int obtenerEntero() {
		int num = 0;
		boolean esValido = false;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while (!esValido) {
			try {
				System.out.println("Ingrese un numero entero");
				num = Integer.valueOf(entrada.readLine());

				esValido = true;
			} catch (Exception exc) {
				System.out.println("error " + exc);
			}
		}

		return num;
	}

}
