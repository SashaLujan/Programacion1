package practicaParcial;

/*Compruebe si el patrón se repitió N o más veces y si es así que elimine del arreglo las secuencias que se
siguen repitiendo consecutivamente luego de la cantidad N.*/

public class practica5 {

	final static int MAX = 21;

	public static void main(String[] args) {

		int[] datos = { -1, 12, 22, 44, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1 };
		int[] patron = { -1, -1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

		int N = 2;

		int inicio = 0;
		int fin = -1;
		int inicioP = buscarInicio(patron, 0);
		int finP = buscarFin(patron, inicioP);
		int cantPatron = 0;
		int cantRep = 0;

		mostrarArreglo(datos);

		while (inicio < MAX) {
			inicio = buscarInicio(datos, fin + 1);
			if (inicio < MAX) {
				fin = buscarFin(datos, inicio);

				if (sonIguales(datos, inicio, fin, patron, inicioP, finP)) {// revisar
					cantPatron++;
					if (cantPatron > N) {
						eliminarSecRepetidas(datos, inicio, fin);
						fin = inicio;

					} else if (cantPatron == N) {
						cantRep++;
					}

				} else
					cantPatron = 0;

			}

		}

		System.out.println("\ncantidad de patrones " + cantRep);

		System.out.println("\narreglo modificado: ");
		mostrarArreglo(datos);
	}

	public static void eliminarSecRepetidas(int[] datos, int inicio, int fin) {
		for (int i = inicio; i <= fin; i++) {
			correrIzq(datos, inicio);
		}
	}

	public static void correrIzq(int[] datos, int pos) {
		for (int i = pos; i < MAX - 1; i++) {
			datos[i] = datos[i + 1];
		}
	}

	public static boolean sonIguales(int[] datos, int inicioD, int finD, int[] patron, int inicioP, int finP) {

		int tamD = finD - inicioD + 1;
		int tamP = finP - inicioP + 1;

		if (tamD == tamP) {
			while (inicioD <= finD && datos[inicioD] == patron[inicioP]) {
				inicioD++;
				inicioP++;
			}
			if (inicioD > finD) {
				return true;
			} else
				return false;
		} else
			return false;

	}

	public static int buscarFin(int[] array, int inicio) {
		while (inicio < MAX && array[inicio] != -1) {
			inicio++;
		}
		return inicio - 1;
	}

	public static int buscarInicio(int[] array, int inicio) {
		while (inicio < MAX && array[inicio] == -1) {
			inicio++;
		}
		return inicio;
	}

	public static void mostrarArreglo(int[] datos) {
		for (int i = 0; i < MAX; i++) {
			System.out.print(datos[i] + "|");
		}
	}

}
