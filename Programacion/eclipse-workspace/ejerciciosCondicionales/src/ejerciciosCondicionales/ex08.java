package ejerciciosCondicionales;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		
		int num1, num2, ope, total, respuestaTotal;
		char auxOpe;
		
		System.out.println("A continuación te daré 2 números y un operador, y tendrás que resolverlo");
		
		num1 = (int) (Math.random() * 99) + 1;
		num2 = (int) (Math.random() * 99) + 1;
		ope = (int) (Math.random() * 3) + 1;
		
		if (ope==1) {
			auxOpe = '+';
			total = num1 + num2;
		} else if (ope == 2) {
			auxOpe = '-';
			total = num1 - num2;
		} else {
			auxOpe = '*';
			total = num1 * num2;
		}
		
		System.out.println("La operación a realizar es: " + num1 + auxOpe + num2);
		Scanner sc = new Scanner(System.in);
		respuestaTotal = sc.nextInt();
		
		if (respuestaTotal == total) {
			System.out.println("Enhorabuena, has acertado la operación!");
		} else {
			System.out.println("Lo siento, has fallado la operación :'C");
		}
		
		sc.close();
	}
	
}
