package practicaParcial;

/*Se desea implementar un algoritmo de compresión que comprima aquellas porciones
de la imagen distintas del color negro (0 en la escala de valores del pixel). 
Se debe implementar la solución para un arreglo (luego dicha solución se reutilizará en 
un futuro para cada fila de la matriz). 
Para ello, se pide realizar un programa en JAVA que, dado un arreglo de tamaño M, 
para cada secuencia delimitada por uno o mas pixeles de color negro (valor 0) con más 
de X repeticiones de un valor de píxel (todos los elementos de la secuencia deben ser iguales),
comprima la secuencia poniendo en la primera posición el valor negado de la cantidad de ocurrencias
y a continuación el valor del pixel que se repite. 
El arreglo empieza y termina con un separador 0 (color negro)*/

public class practica1 {

	final static int M=20;
	final static int X=3; //repeticiones
	final static int Separador = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array = {0,67,67,67,67,67,67,67,67,0,14,0,33,33,33,33,0,5,98,0};
		
		mostrarArreglo(array);
		
		resolver(array);
		
		System.out.println("\narreglo modificado:");
		mostrarArreglo(array);
	}
	
	public static void resolver(int [] array) {
		int inicio = 0;
		int fin = -1;
		
		while(inicio<M) {
			inicio = buscarInicio(array,fin+1);
			if(inicio<M) {
				fin = buscarFin(array,inicio);
				if((fin-inicio+1)>=X && sonIguales(array,inicio,fin)) {
					comprimirSec(array,inicio,fin);
					fin=inicio+1;
				}
			}
		}
	}
		
	public static void comprimirSec(int[]array, int inicio, int fin) {
		
		array[inicio] = -(fin-inicio+1);
				
		for(int i=inicio+2; i<=fin; i++) {
			corrimientoIzq(array, inicio+2);
		}
	}
	
	public static void corrimientoIzq(int[]array, int pos) {
		for (int i=pos;i<M-1;i++)
		      array[i]=array[i+1];
	}
	
	public static boolean sonIguales(int[]array, int inicio, int fin) {
		
		while(inicio<=fin && array[inicio]==array[inicio+1]) {
			inicio++;
		}

		if(inicio>fin) {
			return false;
		}
		else
			return true;
	}
	
	public static int buscarFin(int []array, int inicio) {
		while(inicio<M && array[inicio]!=0) {
			inicio++;
		}
		
		return inicio-1;
	}
	
	public static int buscarInicio(int []array, int inicio) {
		
		while(inicio<M && array[inicio]==0) {
			inicio++;
		}
		
		return inicio;
	}
	
	public static void mostrarArreglo(int[]array) {
		for(int i=0; i<M; i++) {
			System.out.print(array[i] + "|");
		}
	}

}
