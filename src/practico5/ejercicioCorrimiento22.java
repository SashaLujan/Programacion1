package practico5;

/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.*/

public class ejercicioCorrimiento22 {

	final static int MAX = 10;
	final static int SEP = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int cantElemVal= MAX;
		mostrarArreglo(array);
		
		eliminarPares(array, cantElemVal);

		System.out.println("\narreglo modificado");
		mostrarArreglo(array);
	}
	
	public static void eliminarPares(int [] array, int cantElemVal) {
		int pos=0;
		
		for (int i = 0; i < MAX; i++) {
            if (array[i] % 2 != 0) { // Si el elemento es impar
                correrIzq(array,pos); // Copiar el elemento al nuevo arreglo
                pos++; // Incrementar el índice del nuevo arreglo
            }
        }
		
		for (int i = pos; i < MAX; i++) { //rellena los espacios con un separador
            array[i] = SEP;
        }
	}
	
	
	public static void correrIzq(int[] array, int pos) {
		for (int i = pos; i < MAX - 1; i++) {
			array[i] = array[i + 1];
		}
	}

	public static void mostrarArreglo(int[] array) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
