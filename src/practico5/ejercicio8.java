package practico5;

/*Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.*/

public class ejercicio8 {

	final static int MAX = 5;
	
	public static void main(String[] args) {
		
		int [] array = {3,5,10,18,22};
		
		boolean esAsc = esAscendente(array);
		
		System.out.println("los valores almacenados en el arreglo estan en orden ascendente: " + esAsc);
	}
	
	public static boolean esAscendente(int [] arr) {
		
		int pos = 0;
		
		while((pos<MAX-1) && (arr[pos]<=arr[pos+1])) { //orden ascendente
			pos++;
			//esAscendente = true;
		}
		if(pos<MAX-1) {
			return false;
		}
		else		
			return true;
	}

}
