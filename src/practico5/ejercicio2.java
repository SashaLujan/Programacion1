package practico5;

/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.*/


public class ejercicio2 {

	final static int MAX = 10;
	
	public static void main(String[] args) {
		
		int [] arreglo = {2,4,5,33,4,5,6,12,32,43};
		
		double promedio = calcularProm(arreglo);
		
		System.out.println("el promedio del arreglo es: " + promedio);
	}
	
	public static double calcularProm (int [] array) {
		int suma = 0;
		
		for(int i = 0; i < MAX; i++) {
			suma += array[i];
		}
		
		return ((double)suma/MAX);
	}

}
