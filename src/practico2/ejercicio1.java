/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa completo (declaraci�n de constantes y variables, carga
 * de datos, procesamiento e impresi�n de resultados) para cada caso o �tem que:
 * a. solicite un n�mero e indique si es positivo o negativo. b. solicite un
 * n�mero e imprima �grande� si es mayor a 100 y �chico � si es menor. c.
 * solicite un n�mero del 1 al 7 e imprima el d�a de la semana. d. solicite una
 * letra e imprima si es vocal o consonante. e. solicite 3 n�meros e imprima
 * �creciente� si los tres n�meros est�n en orden creciente, �decreciente� si
 * est�n en orden decreciente o �error� si no cumplen ning�n orden
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
				System.out.println("mi�rcoles");
				break;
			case 5:
				System.out.println("jueves");
				break;
			case 6:
				System.out.println("viernes");
				break;
			case 7:
				System.out.println("s�bado");
				break;
			}*/
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
	}

}
