/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones.
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int resultado;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese 1er número real");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 2do número real");
			num2 = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese 3er número real");
			num3 = Integer.valueOf(entrada.readLine());
			
			resultado = num1/num2;
			
			System.out.println("resultado obtenido: " + (resultado-num3));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
