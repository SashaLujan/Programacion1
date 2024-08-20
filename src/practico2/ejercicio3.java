/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que solicite el ingreso de un número mayor a 50, y lo
 * muestre por pantalla en caso de ser múltiplo de 2 o 3.
 *
 */
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 51;
		boolean esmultiplo;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un número mayor a 50");
			num = Integer.valueOf(entrada.readLine());
			esmultiplo = ((num%2)==0 || (num%3)==0);
			if(num>50 && esmultiplo) {
				System.out.println("es multipo de 2 o de 3");
			}

		} catch (Exception exc) {
			System.out.println("error " + exc);
		}

	}
}
