package practico2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:

dado = (int) (6*Math.random() + 1)
 * */

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = obtenerEntero();
		
		int dado = (int) (6*Math.random() + 1);
		
		if(N>=1 && N<=6) {
			//simularLanzamiento(N, dado);
		}
		
		System.out.println("el valor " + N + "salio "  );
	     
	}

	/**
	 * @return
	 */
	public static int obtenerEntero() {
		
		int num = 0;
		boolean esValido = false;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		while(!esValido) {
			try {
				System.out.println("ingrese un valor del dado");
				num = Integer.valueOf(entrada.readLine());
				
				esValido = true;
				
			} catch(Exception exc) {
				System.out.println("error " + exc);
			}
		}
		
		return num;
	}

}
