/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Escribir un programa que permita ingresar dos números enteros,
incremente el primero y decremente el segundo, para luego
mostrar por pantalla en ambos casos, el valor original y el
modificado.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er entero");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 2do entero");
			num2 = Integer.valueOf(entrada.readLine());
			
			System.out.println("valor inicial del 1er número: " + (num1++) + "valor incrementado es: " + num1);
			System.out.println("valor inicial del 2do número: " + (num2--) + "valor decreciente es: " + num2);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
