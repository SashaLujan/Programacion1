/**
 * 
 */
package practico1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author usuario
 *
 */
public class Circulo {

	 static void main(String[] args) {
		// TODO Auto-generated method stub

		 final float PI = 3.14159f;
		 float radio = 0f;
		 float area, perimetro;
		 
		 try {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("ingrese el radio del circulo");
				radio = Float.valueOf(entrada.readLine());
				
				area = PI * radio * radio;
				System.out.println("el area de un circulo de radio " + radio + " es " + area);
				
				perimetro = 2 * PI * radio;
				System.out.println("el perimetro de un circulo de radio " + radio + " es " + perimetro);
				
		 }
		 catch (Exception exc) {
			 System.out.println("hubo un error en los datos ingresados");
			 System.out.println(exc);
		 }
	}

}
