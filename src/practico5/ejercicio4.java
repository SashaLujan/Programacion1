package practico5;

/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.*/

public class ejercicio4 {

	final static int MAX = 10;
	public static void main(String[] args) {
		char [] array = {'g','w','e','c','d','s','t','v','a','n'};
		char letra = 'z';
		
		int posElemento = buscarPosElemento(array, letra);
		if(posElemento<MAX) {
			System.out.println("el elemento " + letra + " esta en la posicion " + posElemento);
		}
		else
			System.out.println("el elemento " + letra + " no existe en el arreglo");
	}
	
	public static int buscarPosElemento(char[]array, char letra) {
		int pos=0;
		
		while(pos<MAX && array[pos]!=letra) {
			pos++;
		}
		
		return pos;
	}

}