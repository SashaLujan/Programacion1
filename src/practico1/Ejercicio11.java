/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *Escribir un programa que permita el ingreso de un número entero
por teclado e imprima el resultado de determinar:
a. si es múltiplo de 6 y de 7,
b. si es mayor a 30 y múltiplo de 2, o es menor igual a 30,
c. si el cociente de la división de dicho número por 5 es mayor
que 10.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un entero");
			num = Integer.valueOf(entrada.readLine());
			System.out.println("¿es múltiplo de 6 y de 7?: " + (((num%=6)==0) && ((num%=7)==0)));
			System.out.println("¿es mayo a 30 y múltiplo de 2 o es menor igual a 30?: " + 
								((num>30) && ((num%=2)==0) || (num<=30)));
			System.out.println("¿el cociente de la división de dicho número por 5 es mayor que 10?: " +
								((num/5)>10));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
