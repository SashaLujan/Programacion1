/**
 * 
 */
package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 7. Escribir un programa que mientras el usuario cargue desde teclado un
 * número entero distinto de 0, imprima por pantalla la suma que se obtiene de
 * invocar un método que calcula la sumatoria de los primeros 200 números
 * naturales (son números enteros entre 1 y 200).
 */
public class ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = obtenerNumero();
		while (num != 0) {
			calcularSuma(num);
			num = obtenerNumero();
		}
	}

	/**
	 * @param obtenerNumero
	 */
	private static void calcularSuma(int num) {

		int suma = 0;
		for (int i = 1; i > 0 && i <= 200; i++) {
			suma += i;
		}
		System.out.println("la suma es: " + suma);

	}

	/**
	 * @return
	 */
	private static int obtenerNumero() {
		int num = 1;
		boolean esValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!esValido) {
			try {
				System.out.println("ingrese un numero entero distinto a 0");
				num = Integer.valueOf(entrada.readLine());

				esValido = true;

			} catch (Exception exc) {
				System.out.println("error " + exc);
			}
		}
		return num;
	}

}
