/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author usuario
 *
 */
public class carrefivePromo {

	/**
	 * escribir un programa que dado el día de la semana que se hace la compra
	 * y el importe del ticket, verifique si aplica hacer el descuento o no.
	 * 
	 * martes
	 * compratotal > 13mil = 5%desc
	 * compratotal > 20mil = 7.5%desc
	 *  
	 * jueves
	 * compratotal > 25mil = 10%desc
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalTicket;
		int dia;
		boolean descuento;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese monto del ticket");
			totalTicket = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese el día, 1 si es martes y 2 si es jueves");
			dia = Integer.valueOf(entrada.readLine());
			
			descuento = (dia==1 || dia==2);
			System.out.println("aplica al descuento del día martes con un descuento del 5% : " + 
								(descuento = (dia==1)&&(totalTicket>13000 && totalTicket<20000)));
			System.out.println("aplica al descuento del día martes con un descuento del 7.5% : " +
								(descuento = (dia==1)&&(totalTicket>20000)));
			System.out.println("aplica al descuento del día jueves con un descuento del 10% : " +
								(descuento = (dia==2)&&totalTicket>25000));
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
