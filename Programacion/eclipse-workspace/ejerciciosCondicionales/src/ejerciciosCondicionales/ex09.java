package ejerciciosCondicionales;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		double angulo, auxRad, totalRad;
		
		System.out.println("Dime cuántos grados tiene un ángulo, y te mostrare el equivalente en radianes");
		
		Scanner sc = new Scanner(System.in);
		angulo = sc.nextDouble();
		
		auxRad = 180;
		
		if (angulo >= 0 && angulo <= 360) {
			totalRad = (angulo * Math.PI)/auxRad;
			System.out.println("El equivalente en radianes de " + angulo + " es " + totalRad + " radianes.");
		} else {
			angulo = angulo % 360;
			totalRad = (angulo * Math.PI)/auxRad;
			System.out.println("El angulo que me has dicho se sale del rango, por tanto lo he transformado a dicho rango");
			System.out.println("El equivalente al ángulo que me has dicho es " + angulo);
			System.out.println("El equivalente en radianes de " + angulo + " es " + totalRad + " radianes.");
		}
		
		sc.close();
	}

}
