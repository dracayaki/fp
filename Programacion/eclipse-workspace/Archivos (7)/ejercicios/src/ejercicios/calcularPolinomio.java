package ejercicios;

import java.util.Scanner;

/*
 * 	Dado el siguiente polinomio de segundo grado: y=ax2+ bx +c
	crea un programa que pida los coeficientes a, b y c, así como 
	el valor de x, y calcula	el valor correspondiente de y.
 * */
public class calcularPolinomio {
	
	public static void main(String[] args) {
		
		float a, b, c, x, y;
		
		System.out.println("Dime un valor para a, b, c y x");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		x = sc.nextFloat();
		sc.close();
		
		y = (float) (a * Math.pow(x, 2)) + b * x + c;
		System.out.println("El valor de y es: " + y);
		
	}

	


}
