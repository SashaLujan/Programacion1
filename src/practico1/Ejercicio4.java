/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, numero3, numero4, numero5;
				
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er número");
			numero1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 2do número");
			numero2 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 3er numero");
			numero3 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 4to número");
			numero4 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 5to número");
			numero5 = Integer.valueOf(entrada.readLine());
			//System.out.println("números ingresados: " + numero1 + numero2 + numero3 + numero4 + numero5);
			System.out.println("números ingresados: " + numero5 + numero4 + numero3 + numero2 + numero1);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
