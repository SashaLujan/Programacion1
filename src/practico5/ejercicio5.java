/**
 * 
 */
package practico5;

/**
 * Hacer un programa que dado un arreglo de caracteres de tamaño MAX que se
 * encuentra cargado, invierta el orden del contenido.
 *
 */
public class ejercicio5 {

	final static int MAX = 10;
	
	public static void main(String[] args) {
		
		char [] array = {'g','w','e','c','d','s','t','v','e','n'};
		
		
		mostrarArray(array);
		invertirArray(array);
		System.out.println("\narreglo modificado:");
		mostrarArray(array);

	}

	/**
	 * @param array
	 */
	public static void mostrarArray(char[] array) {
		// TODO Auto-generated method stub
		for(int i = 0; i < MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	public static void invertirArray(char[] array) {
		int posIni=0;
		int posFin=MAX-1;
		char temp;
		
		while(posIni<posFin) {
			temp = array[posIni]; //guarda la pos del inicio
			array[posIni] = array[posFin]; // lo cambia por el ultimo
			array[posFin] = temp; //ahora lo guarda
			
			posIni++;//cambia los indices
			posFin--;
		}
		
		
	}

}
