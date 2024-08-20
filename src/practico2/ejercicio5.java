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
public class ejercicio5 {

	/**
	 * Escribir un programa que solicite una hora del día (valor entero de la hora
	 * solamente) y resuelva en cada caso
	 */
	public static void main(String[] args) {
		int hora;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese una hora");
			hora = Integer.valueOf(entrada.readLine());

			if (hora > 0 && hora <= 5) { //5.a
				int temp;
				System.out.println("ingrese temperatura");
				temp = Integer.valueOf(entrada.readLine());

				if (temp < 20) {
					System.out.println("encender calefacción");
				} else if (temp > 25) {
					System.out.println("apagar calefacción");
				} else
					System.out.println("calefaccíon encendida, no abra las ventanas");
			} else if (hora >= 6 && hora <= 11) { //5.b
				char letra = ' ';
				boolean vocales = false;

				System.out.println("ingrese una letra minúscula");
				letra = entrada.readLine().charAt(0);

				if (letra >= 'a' && letra <= 'z') {
					switch (letra) {
					case 'a': case 'e': case 'i': case 'o': case 'u':
						vocales = true;
						System.out.println("es una vocal");break;
						default: System.out.println("es una consonante");
					}
					if(vocales) {
						switch(hora) {
						case 6: case 8: case 10: case 11:
							System.out.println("tiene dos vocales"); break;
							default: System.out.println("tiene tres vocales");
						}
					} else
						System.out.println("tiene dos consonantes");
				}
			} else if(hora>=12 && hora<=17) { //5.c
				if(hora%2==0) {
					System.out.println("promedio entre la hora ingresada y el límite inferior del rango es: "  );
				}
				
				
			} 

		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
	}

}
