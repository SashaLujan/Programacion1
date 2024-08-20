package practico5;

//Dado un arreglo de caracteres, determinar si en el arreglo existe al
//menos una letra repetida.

public class ejercicio9 {

	final static int MAX = 6;
	public static void main(String[] args) {
		char [] array = {'a','b','c','d','e','a'};
		
		boolean letraRepetida = buscarLetraRepetida(array);
		
		System.out.println("en el arreglo existe al menos una letra repetida: " + letraRepetida);
	}

	
	public static boolean buscarLetraRepetida(char [] array) {
		
		for(int i=0; i<MAX-1;i++) {
			for(int j= i+1; j<MAX; j++) {
				if(array[i]==array[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
