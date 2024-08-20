package practico5;

//buscar la posicion del mayor elemento

public class ejemplo2 {

	final static int MAX = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array = {9,12,18,1,3};
		
		int posMayor = buscarPosMayor(array);
		
		System.out.println("la posicion del mayor elemento es: " + posMayor);
	}

	public static int buscarPosMayor(int [] arr) {
		int mayor = Integer.MIN_VALUE;
		int posMayor = -1;
		
		for(int pos = 0; pos < MAX; pos++) {
			if(arr[pos]>mayor) {
				mayor = arr[pos];
				posMayor = pos;
			}
		}
		
		return posMayor;
	}
}
