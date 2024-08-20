/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa donde el usuario ingrese un número entre 0 y 999, y
 * muestre un mensaje de cuántos dígitos tiene. Además, si tiene 3 dígitos
 * debe informar qué número es.
 *
 */
public class ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un número entre 0 y 999");
			num = Integer.valueOf(entrada.readLine());
			
			if(num >= 0 && num<10) {
				System.out.println("el número " + num + " tiene 1 dígito");
			}
			else if(num>=10 && num<100) {
				System.out.println("el número " + num + " tiene 2 dígitos");
			}
			else
				System.out.println("el número " + num + " tiene 3 dígitos");
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}

	}

}
