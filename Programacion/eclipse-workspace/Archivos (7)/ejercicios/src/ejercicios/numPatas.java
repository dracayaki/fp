package ejercicios;

import java.util.Scanner;

/*
 * Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:

El número de hormigas capturadas (6 patas).
El número de arañas capturadas (8 patas).
El número de cochinillas capturadas (14 patas).
La aplicación debe mostrar el número total de patas.

 */
public class numPatas {

	public static void main(String[] args) {
		
		int numHor, numAra, numCoch, totalPatas;
		int patasHor, patasAra, patasCoch;
		
		System.out.println("A continuación dime cuantas hormigas, arañas y cochinillas has capturado");
		Scanner sc = new Scanner(System.in);
		numHor = sc.nextInt();
		numAra = sc.nextInt();
		numCoch = sc.nextInt();
		sc.close();
		
		patasHor = 6;
		patasAra = 8;
		patasCoch = 14;
		
		totalPatas = numHor * patasHor + numAra * patasAra + numCoch * patasCoch;
		System.out.println("El numero total de patas es: " + totalPatas);
	}
}
