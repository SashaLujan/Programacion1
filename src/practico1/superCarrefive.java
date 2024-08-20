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
public class superCarrefive {

	/**
	 * debe imprimir el encabezado del ticket de compra de los clientes con
	 * cierto formato para cumplir las exigencias de la administracion federal de ingresos privados.
	 * en el mismo, debe figurar la fecha y hora, numero de ticket, cuit, nombre del cajero, numero
	 * de caja, dni del cliente y la leyenda "el precio lo pone el cliente"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String cuit = "99-34567833-9";
		final String leyenda = "El precio lo pone el cliente";
		String fecha = "3/4/2024";
		String hora = "19:30";
		int ticket;
		String cajero;
		int numCaja;
		int dniCliente;
		
		try {
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese número de ticket");
			ticket = Integer.valueOf(entrada.readLine());
			System.out.println("ingreso nombre del cajero");
			cajero = entrada.readLine();
			System.out.println("ingrese número de caja");
			numCaja = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese DNI del cliente");
			dniCliente = Integer.valueOf(entrada.readLine());
			
			System.out.println("ticket" + "\n " + fecha + " - " + hora + "\t Ticket Nro. " + ticket + "\n"
								+ "\t CUIT: " + cuit
								+ "\n Cajero: " + cajero + "\t Caja: " + numCaja
								+ "\n DNI: " + dniCliente + "\t" + leyenda);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
