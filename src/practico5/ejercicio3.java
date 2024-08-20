package practico5;

/*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.*/

public class ejercicio3 {

	final static int MAX = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arreglo = {2,4,5,33,4,5,6,12,32,43};
		double promedio = calcularProm(arreglo);
		int elementosMayores = buscarElementosMayores(arreglo, promedio);
		
		System.out.println("los elemntos que estan por encima del promedio son: " + elementosMayores);
	}
	
	public static int buscarElementosMayores(int [] array, double promedio) { 
		int cant = 0;
		
		for(int pos = 0; pos < MAX; pos++) {
			if(array[pos]>promedio) {
				cant++;
			}
		}
		
		return cant;
	}
	
	public static double calcularProm (int [] array) {
		int suma = 0;
		
		for(int i = 0; i < MAX; i++) {
			suma+=array[i];
		}
		
		return ((double)suma/MAX);
	}

}
