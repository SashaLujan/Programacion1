package practico5;

/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.*/

public class ejercicio7 {

	final static int MAX = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {2,3,5,3,8};
		int N = 3;
		
		int [] posiciones = buscarPos(array, N);
		int M = 2;
		
		
		
		System.out.println("arreglo original: ");
		mostrarArray(array);
		System.out.println("\narreglo con posiciones donde se encuestra '" + N +"': ");
		mostrarPosiciones(posiciones);
	
		multiplicarOcurrencias(array, N, M);	
		System.out.println("\narreglo original modificado");
		mostrarArray(array);
	}
	
	public static void multiplicarOcurrencias(int [] array, int N, int M) {
		for(int i=0; i<MAX; i++) {
			if(array[i]==N) {
				array[i] *= M;
			}
		}
	}
	
	public static int [] buscarPos(int [] array, int N) {
		
		int cont=0;
		
		// Llenar el arreglo de posiciones con las posiciones donde se encuentra el número
		int [] posiciones = new int [MAX];
		
		for(int i=0; i<MAX;i++) {
			if(array[i]==N) {
				posiciones[cont]=i;
				cont++;
			}
		}
		
		return posiciones;
		
		
	}
	
	public static void mostrarArray(int [] array) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	public static void mostrarPosiciones(int [] posiciones) {
		for(int i=0; i<MAX; i++) {
			System.out.print(posiciones[i] + "|");
		}
	}

}
