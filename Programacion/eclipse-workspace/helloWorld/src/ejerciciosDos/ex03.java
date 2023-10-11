package ejerciciosDos;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		String	cadena, cadena2;
		int		longitud;
		
		System.out.println("Dime una cadena de caracteres y la longitud que quieres que tenga");
		
		Scanner sc	= new Scanner(System.in);
		cadena		= sc.nextLine();
		longitud	= sc.nextInt();
		
		cadena2		= cadena.substring(0, longitud);
		
		System.out.println(cadena2);
		
		sc.close();
	}
	
}
