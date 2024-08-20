/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * escribir un programa que pida al usuario los 3 angulos de
 *un triángulo e imprima por pantalla:
 *si es un triangulo valido
 *si es un rectangulo (solo si es valido)
 *si es un acutangulo (solo si es valido)
 *si es obtusangulo (solo si es valido)
 */
public class Angulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado1, lado2, lado3;
		boolean esvalido = true;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingresar 1er lado del triangulo");
			lado1 = Integer.valueOf(entrada.readLine());
			System.out.println("ingresar 2do lado del triandulo");
			lado2 = Integer.valueOf(entrada.readLine());
			System.out.println("ingresar 3er lado del triangulo");
			lado3 = Integer.valueOf(entrada.readLine());
			
			esvalido = ((lado1+lado2+lado3)==180 && lado1>0 && lado2>0 && lado3>3);
			System.out.println("es un triangulo valido: " + esvalido);
			System.out.println("es un triangulo rectangulo valido: " + (esvalido && (lado1==90 || lado2==90 || lado3==90)));
			System.out.println("es un triangulo acutangulo: " + (esvalido && lado1<90 && lado2<90 && lado3<90));//tres lados iguales
			System.out.println("es un triangulo obtusangulo: " + (esvalido && (lado1>90 || lado2>90 || lado3>90)));//mayor a 90
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
