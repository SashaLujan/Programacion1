/**
 * 
 */
package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * realizar un programa que dado un caracter ingresado desde
 * teclado (a o b) permita realizar dos operaciones entre dos
 * enteros N y M menores a 10 ingresados desde teclado también
 * las operaciones son:
 * 1- si el usuario ingresa a obtener la suma entre N y M
 * 2- si el usuario ingresa b obtener la resta entre N y M
 *
 */
public class ejemplo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char letra = obtenerCaracter();
		System.out.println("letra ingresada " + letra);
		operaciones(letra);
	}
	
	public static void operaciones(char letra) {
		int N = obtenerEntero();
		int M = obtenerEntero();
		
		if(letra == 'a') {
			System.out.println("suma entre " + N + " y " + M + "=" + (N+M));
		}
		else
			System.out.println("resta entre " + N + " y " + M + "=" + (N-M));
	}
	
	public static int obtenerEntero() {
		int num = 20;
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		while(num>10) {
			try {
				System.out.println("ingrese un numero entero menor a 10");
				num = Integer.valueOf(entrada.readLine());
			} catch (Exception exc){
				System.out.println("error " + exc);
			}
		}
		return num;
	}
	
	public static char obtenerCaracter(){
		
		char letra = ' ';
		
		BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
		while(letra != 'a' && letra != 'b') {
			try {
				System.out.println("ingrese un caracter A o B");
				letra = entrada.readLine().charAt(0);
			} catch (Exception exc){
				System.out.println("error " + exc);
			}
		}
		return letra;
	}

}
