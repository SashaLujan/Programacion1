/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que permita ingresar 5 n�meros de a uno por
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
			System.out.println("ingrese 1er n�mero");
			numero1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 2do n�mero");
			numero2 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 3er numero");
			numero3 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 4to n�mero");
			numero4 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 5to n�mero");
			numero5 = Integer.valueOf(entrada.readLine());
			//System.out.println("n�meros ingresados: " + numero1 + numero2 + numero3 + numero4 + numero5);
			System.out.println("n�meros ingresados: " + numero5 + numero4 + numero3 + numero2 + numero1);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
