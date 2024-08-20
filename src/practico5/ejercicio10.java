package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.*/

public class ejercicio10 {

	final static int MAX = 8;

	public static void main(String[] args) {

		int[] array = { 22, 5, 4, 55, 6, 7, 11, 1 };

		int N = obtenerEntero();

		mostrarArreglo(array);

		boolean contarPrimos = operar(array, N);

		System.out.println("\nel arreglo tiene al menos " + N + " numeros primos: " + contarPrimos);

	}

	public static boolean operar(int[] array, int N) {
		int cont = 0;

		for (int i = 0; i < MAX; i++) {
			if (esprimo(array[i])) {
				cont++;
				if (cont > N) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean esprimo(int num) {
		if (num <= 1) {
			return false; // Si el número es 0 o 1, no es primo
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // Si el número es divisible por algún otro número entre 2 y su raíz cuadrada,
								// no es primo
			}
		}
		return true; // Si no se encontró ningún divisor, el número es primo
	}


	public static int obtenerEntero() {
		int num = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un entero");
			num = Integer.valueOf(entrada.readLine());

		} catch (Exception exc) {
			System.out.println(exc);
		}

		return num;
	}

	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
