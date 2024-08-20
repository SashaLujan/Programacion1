/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * hacer un programa que dado un valor ingresado por el usuario entre 1 y 3
 * inclusive (si ingresa otro valor termina), imprima como salida "bajo" en el
 * caso de que ingrese 1, "medio" si ingresa 2, "alto" si ingresa 3
 */
public class ejemploSentencias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX = 3;
		final int MIN = 1;
		int num = 1;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while (num >= MIN && num <= MAX) {
			try {
				System.out.println("ingrese un número");
				num = Integer.valueOf(entrada.readLine());

				switch (num) {
				case 1:
					System.out.println(num + " es bajo");
					break;
				case 2:
					System.out.println(num + " es medio");
					break;
				case 3:
					System.out.println(num + " es alto");
					break;
				}
			} catch (Exception exc) {
				System.out.println("error" + exc);
			}
		}
	}

}
