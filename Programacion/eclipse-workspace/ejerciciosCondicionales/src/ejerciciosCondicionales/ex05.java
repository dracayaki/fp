package ejerciciosCondicionales;

import java.util.Scanner;

// Escribe una aplicación que solicite por consola dos números reales 
// que corresponden a la base y la altura de un triángulo. Deberá mostrarse su área, 
// comprobando que los números introducidos por el usuario no son negativos, algo 
// que no tendría sentido.

public class ex05 {
	
	public static void main(String[] args) {
	
		double base, altura, area;
		
		System.out.println("Dime un número real que corresponderá a la base del triángulo");
		
		Scanner sc	= new Scanner(System.in);
		base		= sc.nextDouble();
		
		System.out.println("Dime un número real que corresponderá a la altura del triángulo");
		altura		= sc.nextDouble();
		
		area		= 0;
		
		if (base < 0 || altura < 0) {
			System.out.println("Los datos que has introducido son negativos, y por tanto no son válidos");
		} else {
			area	= (base * altura) / 2;
			System.out.println("El aréa del triángulo es: " + area);
		}
		
		sc.close();

	}
}
