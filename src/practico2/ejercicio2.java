/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author usuario
 *
 */
public class ejercicio2 {

	/**
	 * Construir un programa que solicite desde teclado un número de mes y
	 * posteriormente notifique por pantalla la cantidad de días de ese mes. En el
	 * caso de que ingrese 2 como número de mes (febrero) deberá además solicitar
	 * ingresar un número de año y, dependiendo si es bisiesto o no con la siguiente
	 * sentencia: ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	 * imprimir la cantidad de días correspondiente.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		int anio;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un número de mes");
			mes = Integer.valueOf(entrada.readLine());
			
			switch(mes) {
			case 1,3,5,7,8,10,12: System.out.println("tiene 31 días");break;
			case 4,6,9,11: System.out.println("tiene 30 días");break;
			case 2: 
				System.out.println("ingrese año");
				anio = Integer.valueOf(entrada.readLine());
				
				if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
					System.out.println("tiene 29 días");
				} else
					System.out.println("tiene 28 días");
			}
		}catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
