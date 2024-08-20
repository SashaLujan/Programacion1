package practicaParcial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practica4 {

	final static int MAXC = 20;
	final static int MAXM = 5;
	
	public static void main(String[] args) {
		int [] arrayC = {4,3,8,6,2,12,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int [] arrayM = {2,3,5,6,12};
		
		//int cliente = obtenerCantPersonas();
		
		mostrarArreglo(arrayC, MAXC);
		mostrarArreglo(arrayM, MAXM);
		
		hacerReserva(arrayC,arrayM);
		
		System.out.print(arrayC);
	}
	
	public static void hacerReserva(int [] arrayC, int [] arrayM) {
		int indiceCliente = 0;
		int cantMesasAsignadas = 0;
		int numCliente = 0;
		int mesa = 0;
		
		while(indiceCliente<MAXC && arrayC[indiceCliente]!=0 && cantMesasAsignadas<MAXC) {
			numCliente++;
			
			mesa = obtenerMesa(arrayM, arrayC[indiceCliente]);
			if(mesa!=-1) {
				arrayM[mesa] = -arrayM[mesa]; //asigna la mesa y la marca como ocupada
				System.out.println("\nal cliente " + numCliente + " se le asigno la mesa " + mesa);
				cantMesasAsignadas++;
				correrIzq(arrayC, indiceCliente); //elimina el registro del cliente
			}
			else {
				System.out.println("para el cliente " + numCliente + "no se pudo asignar una mesa");
				indiceCliente++;
			}
		}
		if(cantMesasAsignadas>=MAXM) {
			System.out.println("no quedan mas mesas disponibles");
		}
		else
			System.out.println("quedaron " + (MAXM-cantMesasAsignadas) + " mesas sin asignar");
	}
	
	public static void correrIzq(int [] arrayC, int pos) {
		for(int i=pos; i<MAXM-1; i++) {
			arrayC[i]=arrayC[i+1];
		}
	}
	
	public static int obtenerMesa(int [] arrayM, int cantPersonas) {
		int i = 0;
		while(i<MAXM && cantPersonas>arrayM[i]) {
			i++;
		}
		if(i<MAXM) {
			return i;
		}
		else
			return -1;
	}
	
	public static void mostrarArreglo(int [] array, int MAX) {
		for(int i=0; i<MAX; i++) {
			System.out.print(array[i] + "|");
		}
	}
	
	public static int obtenerCantPersonas() {
		int cant = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("ingresar la cantidad de personas a ocupar la mesa:");
			cant = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
		return cant;
	}

}
