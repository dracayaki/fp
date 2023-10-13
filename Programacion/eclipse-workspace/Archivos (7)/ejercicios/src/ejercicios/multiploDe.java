package ejercicios;

import java.util.Scanner;

/*
  * Modifica la actividad anterior para que, indicando dos números n y m, diga
qué cantidad hay que sumarle a n para que sea múltiplo de m.
  * */

public class multiploDe {
	public static void main(String[] args) {
		//declaramos variables
		
		int num1;
		int num2;
		int aux;
		
		//pedimos dos numeros por pantalla
		System.out.println("Dime un número entero");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Ahora dime otro número entero");
		num2 = sc.nextInt();
		sc.close();
		
		aux = num1;
		
		/* ahora creamos un bucle que vaya sumando numeros a num1
		 * hasta que el resultado de la división con num2 sea 0
		 * */
		
		while(num1 % num2 != 0) {
			num1++;
		}
		
		System.out.println("Hay que sumarle " + (num1 - aux) + " para que sea múltiplo de " + num2 + ".");
	}
}
