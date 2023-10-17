package ejerciciosCondicionales;

import java.util.Scanner;

public class ex01 {

	//Escribe una aplicación que solicite al usuario un número comprendido
	//entre 0 y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
	//un número capicúa es aquel que se lee igual de derecha a izquierda y de izquierda a derecha
	
	public static void main(String[] args) {
		
		int	num, num2;
		String numAux, numAux2;
		
		System.out.println("Dime un número entre 0 y 9999 y te diré si es capicúa");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		numAux = String.valueOf(num);
		
		StringBuilder numAlreves = new StringBuilder(numAux);
		numAux2 = numAlreves.reverse().toString();
		
		num2 = Integer.parseInt(numAux2);
		
		System.out.println(numAux);
		System.out.println(numAux2);

		if (num>=0 && num<=9999) {
			if (num==num2) {
				System.out.println("Es capicúa");
			} else if (numAux != numAux2){
				System.out.println("No es capicúa");
			}
		} else {
			System.out.println("El número que has dicho no esta dentro del rango");
		}
	}
	
}
