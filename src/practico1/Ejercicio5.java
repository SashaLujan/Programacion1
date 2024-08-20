/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Escribir un programa que solicite nombre, edad, altura y ocupación, y
	los imprima por pantalla.
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int edad;
		float altura;
		String ocupacion;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un nombre");
			nombre = entrada.readLine();
			System.out.println("ingrese edad");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese altura");
			altura = Float.valueOf(entrada.readLine());
			System.out.println("ingrese ocupación");
			ocupacion = entrada.readLine();
			
			System.out.println("datos ingresados: " + "\nnombre: " + nombre + "\nedad: " + edad +
								"\naltura: " + altura + "\nocupacion: " + ocupacion);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
