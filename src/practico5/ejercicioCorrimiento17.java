package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.*/

public class ejercicioCorrimiento17 {
	
	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int pos = 0;
		int num = obtenerEntero();
		
		mostrarArreglo(array);
		corrimientoDer(array, pos);
		
		array[pos] = num;
		
		System.out.println("\narreglo modificado");
		mostrarArreglo(array);
	}
		
	public static void corrimientoDer(int [] array, int pos) {
		for (int i = MAX - 1; i > pos; i--) {
			array[i] = array[i - 1];
		}
	}
	
	public static int obtenerEntero() {
		int num = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingrese un valor para insertar en el arreglo");
			num = Integer.valueOf(entrada.readLine());
			
		} catch(Exception exc) {
			System.out.println(exc);
		}
		
		return num;
	}
	
	public static void mostrarArreglo(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
