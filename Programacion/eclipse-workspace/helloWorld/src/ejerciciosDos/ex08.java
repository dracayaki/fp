package ejerciciosDos;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		double base, exponente, resultado;
		
		System.out.println("Dime dos números, una será la base y el otro el exponente al que será elevado");
		Scanner sc	= new Scanner(System.in);
		
		base 		= sc.nextDouble();
		exponente	= sc.nextDouble();
		resultado	= Math.pow(base, exponente);
		
		System.out.println("El exponencial de " + base + " es igual a " + resultado);
		
		sc.close();
	}	
}
