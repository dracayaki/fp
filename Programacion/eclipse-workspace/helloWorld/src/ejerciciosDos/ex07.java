package ejerciciosDos;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		double	numDecimal, numAbsoluto;
		
		System.out.println("Dime un número decimal y te diré su valor absoluto");
		Scanner sc	= new Scanner(System.in);
		
		numDecimal	= sc.nextDouble();
		numAbsoluto = Math.abs(numDecimal);
		
		System.out.println("El absoluto del número es: " + numAbsoluto);
		
		sc.close();
	}
	
}
