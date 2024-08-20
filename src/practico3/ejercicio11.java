package practico3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Escribir un método que retorne el mayor de dos números. Usar
ese método para calcular el máximo de una serie de números
ingresados por el usuario (20 números en total).
 * */

public class ejercicio11 {

	final static int MAX = 20;
	public static void main(String[] args) {
		
		//int num = 0;
		int numMayor = Integer.MIN_VALUE;
		
		for(int i = 0; i < MAX; i++) {
			
			numMayor = calcularMax(obtenerEntero(), numMayor);
			
		}
		
		System.out.println("el numero mayor es: " + numMayor);

	}
	
	public static int calcularMax(int num, int numMayor) {
		
		if(num>numMayor) {
			numMayor = num;
		}
		
		return numMayor;
	}
	
	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un numero");
			num = Integer.valueOf(entrada.readLine());
			
		} catch (Exception exc) {
			System.out.println("error " + exc);
		}
		return num;
	}

}
