/**
 * 
 */
package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * un comercio de la ciudad, que realiza horario de corrido de 8:30hs a 19hs,
 * necesita un programa que responda si está abierto o cerrado cuando un usuario
 * / cliente ingresa una hora determianda (hora y minutos)
 *
 */
public class horarioComercio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int horaAbre = 8;
		final int minAbre = 30;
		final int horaCierre = 19;
		final int minCierre = 0;
		int hora;
		int min;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese hora");
			hora = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese minutos");
			min = Integer.valueOf(entrada.readLine());

			if (horaAbre == hora) {
				if (min >= minAbre) {
					System.out.println("el local esta abierto");
				} else {
					System.out.println("el local esta cerrado");
				}
			} else if (hora < horaAbre) {
				System.out.println("local cerrado");
			} else {
				if (hora < horaCierre) {
					System.out.println("el local esta abierto");
				} else if (hora == horaCierre) {
					if (min < minCierre) {
						System.out.println("el local esta abierto");
					} else
						System.out.println("local cerrado");
				} else
					System.out.println("local cerrado");
			}
		} catch (Exception exc) {
			System.out.println("hubo un error: " + exc);
		}
	}

}
