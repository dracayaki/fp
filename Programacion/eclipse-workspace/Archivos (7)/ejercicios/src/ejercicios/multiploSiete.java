package ejercicios;

import java.util.Scanner;

/*Escribe un programa que tome como entrada un número entero e indique qué
 *  cantidad hay que sumarle para que el resultado sea múltiplo de 7.
 *   Un ejemplo:

A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.

Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1, respectivamente.
Pista: El operador módulo puede ser muy útil para solucionar esta actividad.

 * */
 
public class multiploSiete {
	public static void main(String[] args) {
		
		int num;
		int numAux;
		
		
		System.out.println("Dime un numero entero, y te diré cuanto hay que sumarle para que sea múltiplo de 7");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		numAux = num;
		sc.close();
		
		//para que un numero sea multiplo de 7, el resultado de la division debe ser 0
		//creamos un bucle que le sume uno al numero hasta que el resultado de la division sea 0
		
		while(num % 7 != 0) {
			num++;
		}
		/*para saber cuanto hay que sumarle al numero original
		 * he creado una variable auxilir que almacena el numero pedido
		 *  */
		
		System.out.println("Hay que sumarle " + (num - numAux) + " para que sea múltiplo de 7.");
}
}
