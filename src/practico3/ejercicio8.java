package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Realizar un programa que dado dos n�meros enteros y un
car�cter (todos ingresados por el usuario) muestre por pantalla el
resultado de una operaci�n matem�tica b�sica seg�n el valor del
car�cter ingresado. Si se ingres� el car�cter �a� debe realizar la
suma, para �b� la resta, para �c� la multiplicaci�n y para �d� la
divisi�n entre ambos n�meros.*/
public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num1 = obtenerEntero(); 
		 int num2 = obtenerEntero();
		 char letra = obtenerCaracter();
		 
		 operacion(letra, num1, num2);
	}

	/**
	 * @param letra
	 */
	private static void operacion(char letra, int num1, int num2) {
		if(letra>='a' && letra<='z') {
		switch(letra) {
		case 'a': System.out.println("la suma entre " + num1 + " y " + num2 + " es: " + (num1+num2));break;
		case 'b': System.out.println("la resta entre " + num1 + " y " + num2 + " es: " + (num1-num2));break;
		case 'c': System.out.println("la multiplicacion entre " + num1 + " y " + num2 + " es: " + (num1*num2));break;
		case 'd': System.out.println("la division entre " + num1 + " y " + num2 + " es: " + (num1/num2));break;
		}}
	}

	/**
	 * @return
	 */
	private static char obtenerCaracter() {
		char letra = ' ';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un caracter");
			letra = entrada.readLine().charAt(0);
			
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
		return letra;
	}

	/**
	 * @return
	 */
	private static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingresar numero");
			num = Integer.valueOf(entrada.readLine());
			
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
		return num;
	}

}