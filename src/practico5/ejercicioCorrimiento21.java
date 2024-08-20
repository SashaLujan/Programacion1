package practico5;

/*Hacer un programa que inserte un elemento en un arreglo
(ordenado decrecientemente) de tamaño MAX=10.*/

public class ejercicioCorrimiento21 {

	final static int MAX = 10;
	public static void main(String[] args) {
		
		int [] arrayOrd = {23,12,9,8,7,6,6,4,3,2};
		int num = 1;
		int pos = buscarPos(arrayOrd, num);
		System.out.println(pos);
		mostrarArreglo(arrayOrd);
		
		if(pos!=-1) {
			correrDer(arrayOrd, pos);
			arrayOrd[pos] = num;
		}
		else
			arrayOrd[MAX-1]=num;
		
		
		System.out.println("\narreglo modificado:");
		mostrarArreglo(arrayOrd);
	}
	
	public static void correrDer(int [] arrayOrd, int pos) {
		for(int i=MAX-1; i>pos; i--) {
			arrayOrd[i] = arrayOrd[i-1];
		}
	}
	
	public static int buscarPos(int [] arrayOrd, int num) {
		int pos=0;
		while(pos<MAX && arrayOrd[pos]>num) {
			pos++;
		}
		if(pos<MAX) {
			return pos;
		}
		else
			return -1;
		
	}

	public static void mostrarArreglo(int [] arrayOrd) {
		for(int i=0; i<MAX; i++) {
			System.out.print(arrayOrd[i] + "|");
		}
	}
}
