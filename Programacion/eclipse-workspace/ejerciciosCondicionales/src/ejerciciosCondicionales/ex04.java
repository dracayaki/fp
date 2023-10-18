package ejerciciosCondicionales;

import java.util.Scanner;

public class ex04 {
  
// EScribe un programa que solicite al usuario un número
// entre 1 y 99. El programa debe mostrarlo en letras

	
	public static void main(String[] args) {

		int 	num, unidad, decena;
		String 	numStr, decenaStr, unidadStr;
		
		System.out.println("Dime un número entre 1 y 99");
		
		Scanner sc	= new Scanner(System.in);
		num 		= sc.nextInt();
		numStr		= "0";
		decenaStr	= "0";
		unidadStr	= "0";
		
		unidad		= num % 10;
		decena		= num / 10;
		

		

	if (num > 9 && num < 30) {
		switch(num) {
			case 10:
				numStr = "diez";
				break;
			case 11:
				numStr = "once";
				break;
			case 12:
				numStr = "doce";
				break;
			case 13:
				numStr = "trece";
				break;
			case 14:
				numStr = "catorce";
				break;
			case 15:
				numStr = "quince";
				break;
			case 16:
				numStr = "dieciseis";
				break;
			case 17:
				numStr = "diecisiete";
				break;
			case 18:
				numStr = "dieciocho";
				break;
			case 19:
				numStr = "diecinueve";
				break;
			}
		} 
	
		switch(unidad) {
				case 1:
					unidadStr = "uno";
					break;
				case 2:
					unidadStr = "dos";
					break;
				case 3:
					unidadStr = "tres";
					break;
				case 4:
					unidadStr = "cuatro";
					break;
				case 5:
					unidadStr = "cinco";
					break;
				case 6:
					unidadStr = "seis";
					break;
				case 7:
					unidadStr = "siete";
					break;
				case 8:
					unidadStr = "ocho";
					break;
				case 9:
					unidadStr = "nueve";
					break;	
			}

			switch(decena) {
				case 2:
					decenaStr = "veinte";
					break;
				case 3:
					decenaStr = "treinta";
					break;
				case 4:
					decenaStr = "cuarenta";
					break;
				case 5:
					decenaStr = "cincuenta";
					break;
				case 6:
					decenaStr = "sesenta";
					break;
				case 7:
					decenaStr = "setenta";
					break;
				case 8:
					decenaStr = "ochenta";
					break;
				case 9:
					decenaStr = "noventa";
					break;
				}
		
		
		if (num > 0 && num < 10) {
			System.out.println(unidadStr);
		} else if (num > 9 && num < 20) {
			System.out.println(numStr);
		} else if (num > 19 && num < 100 && unidad == 0) {
			System.out.println(decenaStr);
		} else if (num > 19 && num < 100 && unidad != 0){
			System.out.println(decenaStr + " y " + unidadStr);
		} else {
			System.out.println("Error");
		}
		
		
		sc.close();
	}
	
}
