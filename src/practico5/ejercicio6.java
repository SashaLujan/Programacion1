package practico5;

/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima.*/

public class ejercicio6 {

	final static int MAX = 10;
	public static void main(String[] args) {
		
		int [] array = {1,3,23,4,3,2,54,22,10,20};
		
		int pares = obtenerPares(array);
		
		System.out.println("el arreglo tiene esta cantidad de numeros pares: " + pares);
	}

	public static int obtenerPares(int[]array) {
		int cant = 0;
		
		for(int i=0; i<MAX; i++) {
			if(array[i]%2==0) {
				cant++;
			}
		}
		
		return cant;
	}
}

