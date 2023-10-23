package ejerciciosCondicionales;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		int num1, num2, total, respuestaTotal;
		
		System.out.println("A continuación te enseñaré dos números y tendrás que sumarlos, y decirme la respuesta que crees que es");
		
		num1 = (int) (Math.random() * 99) + 1;
		num2 = (int) (Math.random() * 99) + 1;
		total = num1 + num2;
		
		System.out.println("Cuánto es: " + num1 + " + " + num2 );
		Scanner sc = new Scanner(System.in);
		respuestaTotal = sc.nextInt();
		
		if (respuestaTotal == total) {
			System.out.println("Muy bien! Has acertado la suma!");
		} else {
			System.out.println("Has fallado la suma :'C");
		}
		
		sc.close();
	}
	
}
