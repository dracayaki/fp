package ejerciciosDos;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		String 	cadena;
		char	caracter;
		
		System.out.println("Dime una frase y un caracter, y cambiare todos los espacios por un caracter)");
		Scanner sc	= new Scanner(System.in);
		
		cadena		= sc.nextLine();
		caracter	= sc.next().charAt(0);
		cadena		=  cadena.replace(' ', caracter);
		
		System.out.println(cadena);
		
		sc.close();
	}
}
