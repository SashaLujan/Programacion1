/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Pedir por consola el ingreso de números enteros. Cuando se ingrese un 0 se
 * debe terminar el programa informando el promedio de los números ingresados,
 * cuál fue el mayor número y cuál fue el menor número.
 * 
 */
public class ejemploNumGrande {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int numMayor = Integer.MIN_VALUE; //num muy chiquito
		int numMenor = Integer.MAX_VALUE; //num muy grande
		float suma = 0;
		int cantidad = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		while (num != 0) {
			try {
				System.out.println("ingrese un número entero");
				num = Integer.valueOf(entrada.readLine());

				if(num !=0) {
					//calcular promedio
					suma = suma + num;
					cantidad ++;
					
					if (num > numMayor) { //si el num es mayor al que esta guardado, numMayor se vuelve el num ingresado
						numMayor = num;
					}
				}
				
			} catch (Exception exc) {
				System.out.println("error " + exc);
			}
		}

		
		System.out.println("el promedio de los números ingresados es: " + suma/cantidad +
		 "\n el número mayor ingresado fue el: " + numMayor + "\n el número menor ingresado fue el: " + numMenor);
		
	}

}
