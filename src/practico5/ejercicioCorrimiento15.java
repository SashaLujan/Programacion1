package practico5;

/*Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.*/

public class ejercicioCorrimiento15 {

	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = 6;

		mostrarArreglo(array);
		corrimientoDerecha(array, pos);

		System.out.println("\narreglo modificado");
		mostrarArreglo(array);
	}

	public static void corrimientoDerecha(int[] array, int pos) {
		// tomar el ultimo elemento y cambiarlo por el ante ultimo elemento
		// 10 5 3 45 7 ->arr
		// 0 1 2 3 4 ->pos
		// correr a derecha de la pos pasada por parametro
		// 10 5 3 3 7
		for (int i = MAX - 1; i > pos; i--) {
			array[i] = array[i - 1];
		}
	}

	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}