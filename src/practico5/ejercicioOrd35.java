package practico5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y lo inserte en el arreglo manteniendo
su orden. Para ello tendrá que realizar un corrimiento a derecha
(se pierde el último valor del arreglo) y colocar el número en el
arreglo en la posición indicada.*/

public class ejercicioOrd35 {

	final static int MAX = 10;

	public static void main(String[] args) {

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int num = obtenerEntero();
		int pos = buscarPosOrdCreciente(array, num);
		
		mostrarArreglo(array);
		correrDer(array, pos);
		array[pos] = num;
		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}
	
	public static int buscarPosOrdCreciente(int[] array, int num) {
		int pos = 0;
		while ((pos < MAX) && (array[pos] < num)) {
			pos++;
		}
		return pos;

	}

	public static void correrDer(int[] array, int pos) {
		for(int i=MAX-1; i>pos;i--) {
			array[i] = array[i-1];
		}
	}

	public static int obtenerEntero() {
		int num = 0;

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("ingrese un numero para insertar en el arreglo");
			num = Integer.valueOf(entrada.readLine());
		} catch (Exception exc) {
			System.out.println(exc);
		}

		return num;
	}

	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
