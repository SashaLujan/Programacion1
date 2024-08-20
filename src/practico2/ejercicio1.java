/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa completo (declaración de constantes y variables, carga
 * de datos, procesamiento e impresión de resultados) para cada caso o ítem que:
 * a. solicite un número e indique si es positivo o negativo. b. solicite un
 * número e imprima “grande” si es mayor a 100 y “chico “ si es menor. c.
 * solicite un número del 1 al 7 e imprima el día de la semana. d. solicite una
 * letra e imprima si es vocal o consonante. e. solicite 3 números e imprima
 * “creciente” si los tres números están en orden creciente, “decreciente” si
 * están en orden decreciente o “error” si no cumplen ningún orden
 *
 */
public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un numero");
			num = Integer.valueOf(entrada.readLine());

			/*
			 * if(num<0) { //a- System.out.println("es negrativo"); } else
			 * System.out.println("es positivo");
			 */

			/*
			 * if(num>100) { //b- System.out.println("grande"); } else
			 * System.out.println("chico");
			 */

			/*switch (num) {
			case 1:
				System.out.println("domingo");
				break;
			case 2:
				System.out.println("lunes");
				break;
			case 3:
				System.out.println("martes");
				break;
			case 4:
				System.out.println("miércoles");
				break;
			case 5:
				System.out.println("jueves");
				break;
			case 6:
				System.out.println("viernes");
				break;
			case 7:
				System.out.println("sábado");
				break;
			}*/
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
	}

}
