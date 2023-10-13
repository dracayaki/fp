package ejercicios;

import java.util.Scanner;

/*Solicita al usuario tres distancias:

La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.

Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).

 * 
 * */

public class calculoDistancias {

	
	public static void main(String[] args) {
		
		float numMM, numCM, numM, totalCM;
		
		System.out.println("Dime tres medidas, una será en mm, otra en cm y otra en m");
		Scanner sc = new Scanner(System.in);
		numMM = sc.nextFloat();
		numCM = sc.nextFloat();
		numM = sc.nextFloat();
		sc.close();
		
		totalCM = numMM/10 + numM*100 + numCM;
		System.out.println("La suma total en cm es " + totalCM);
	}
}
