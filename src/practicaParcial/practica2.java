/**
 * 
 */
package practicaParcial;

/**
 * @author usuario
 *
 */
public class practica2 {

	
	final static int MAXP = 25;
	final static int MAXT = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayP = {0,0,12,9,18,0,15,5,4,7,10,0,8,9,12,0,19,10,9,0,0,0,0,0,0};
		int [] arrayT = {8,9};
		int cantC = 2;
		int productoR = 22;
		
		int inicio = 0;
		int fin = -1;
		
		mostrarArreglo(arrayP);
		
		while(inicio<MAXP && cantC>0) {
			inicio = buscarInicio(arrayP,fin+1);
			
			if(inicio<MAXP) {
				fin = buscarFin(arrayP,inicio);
				
				if(fin<MAXP) {
					//estoy en condiciones de procesar la secuencia entre inicio y fin
					if(tieneAlMenosUnElemento(arrayP,inicio,fin,arrayT)) {
						//procesar la secuencia
						agregarALFinal(arrayP,fin,productoR);
						cantC--;
						fin++; //modifica el fin porque se agrega un elemnto
					}
				}
			}
		}

		System.out.println("\narreglo modificado");
		mostrarArreglo(arrayP);
		System.out.println("\nquedaron sin incorporar a un pedido" + cantC + "productos");
	}
	
	private static int buscarFin(int[] arrayP, int inicio) {
		while(inicio<MAXP && arrayP[inicio]!=0) {
			inicio++;
		}
		return inicio-1;
	}
	
	private static int buscarInicio(int[] arrayP, int inicio) {
		while(inicio<MAXP && arrayP[inicio]==0) {
			inicio++;
		}
		return inicio;
	}
	
	private static void mostrarArreglo(int[] arrayP) {
		for(int i =0; i<MAXP; i++) {
			System.out.print(arrayP[i] + "|");
		}
	}
	
	public static void agregarALFinal(int[] arrayP, int fin, int productoR) {
		corrimientoDer(arrayP, fin);
		arrayP[fin+1]=productoR;
		
	}
	
	private static void corrimientoDer(int[] arrayP, int pos) {
		for(int i=MAXP-1;i>pos; i--) {
			arrayP[i]= arrayP[i-1];
		}
		
	}
	
	public static boolean tieneAlMenosUnElemento(int[] arrayP, int inicio, int fin, int[] arrayT) {
		// recorrer elemento a elemento la secuencia y ver si existe en el arrayT
		//miestras este destro de la secuencia y el elemento donde estoy parado no este en arrayT avance
		while(inicio<=fin && !existeElemento(arrayP[inicio],arrayT)) {
			inicio++;
		}
		if(inicio <= fin) {//si no me cai de la secuencia, existe al menos un elemento
			return true;
		}
		else
			return false;
	}
	
	//que determine si un valor existe en un arreglo
	public static boolean existeElemento(int valor, int[] arrayT) {
		int pos = 0;
		
		while(pos<MAXT && arrayT[pos]<valor) {
			pos++;
		}
		
		if(pos<MAXT && arrayT[pos]==valor) { //es necesario porque el array esta ordenado
			return true;
		}
		else
			return false;
	}

}
