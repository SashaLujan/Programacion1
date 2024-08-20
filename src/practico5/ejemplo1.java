package practico5;

// buscar el mayor elemento de un arreglo

public class ejemplo1 {

	public static int MAX = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {9,12,18,1,3};
		
		//int mayor = Integer.MIN_VALUE;
		//int mayor = buscarMayor(array);
		
		System.out.println("el mayor es: " + buscarMayor(array));
	}

	public static int buscarMayor(int [] arr) {
		int mayor = Integer.MIN_VALUE;
		
		for(int pos = 0; pos < MAX; pos++) {
			if(arr[pos]>mayor) {
				mayor = arr[pos];
			}
		}
		
		return mayor;
	}
}
