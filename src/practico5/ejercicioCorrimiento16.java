package practico5;

/*Implementar un método que realice un corrimiento a izquierda
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición.*/

public class ejercicioCorrimiento16 {

	final static int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int pos = 3;

		mostrarArreglo(array);
		corrimientoIzquierda(array, pos);

		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}

	public static void corrimientoIzquierda(int[] array, int pos) {
		// tomar el primer elemento y cambiarlo por el ante siguiente elemento
		// 10 5 3 45 7 ->arr
		// 0 1 2 3 4 ->pos
		// correr a izquierda de la pos pasada por parametro
		// 5 3 3 45 7
		for (int i = pos; pos < MAX - 1; pos++) {
			array[pos] = array[pos + 1];
		}
	}

	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}
}
