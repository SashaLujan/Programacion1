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
	 * Construir un programa que solicite desde teclado un n�mero de mes y
	 * posteriormente notifique por pantalla la cantidad de d�as de ese mes. En el
	 * caso de que ingrese 2 como n�mero de mes (febrero) deber� adem�s solicitar
	 * ingresar un n�mero de a�o y, dependiendo si es bisiesto o no con la siguiente
	 * sentencia: ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	 * imprimir la cantidad de d�as correspondiente.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		int anio;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un n�mero de mes");
			mes = Integer.valueOf(entrada.readLine());
			
			switch(mes) {
			case 1,3,5,7,8,10,12: System.out.println("tiene 31 d�as");break;
			case 4,6,9,11: System.out.println("tiene 30 d�as");break;
			case 2: 
				System.out.println("ingrese a�o");
				anio = Integer.valueOf(entrada.readLine());
				
				if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
					System.out.println("tiene 29 d�as");
				} else
					System.out.println("tiene 28 d�as");
			}
		}catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
