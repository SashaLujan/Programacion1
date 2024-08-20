/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que permita el ingreso de dos números
enteros por teclado e imprima:
a. si el primero es mayor al segundo.
b. si ambos son múltiplos de 2.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er entero");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 2do entero");
			num2 = Integer.valueOf(entrada.readLine());
			System.out.println("¿el primer entero es mayo al segundo?: " + (num1>num2));
			System.out.println("¿ambos números son múltiplo de 2?: " + (((num1%=2)==0) && ((num2%=2)==0)));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
