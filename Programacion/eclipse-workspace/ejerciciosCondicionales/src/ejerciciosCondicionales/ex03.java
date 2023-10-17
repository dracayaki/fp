package ejerciciosCondicionales;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		
		int		numanimales;
		double	comidantaria, kilosporAnimal;
		
		System.out.println("A continuación dime la cantidad de comida que compra la granja dirariamente");
		Scanner sc = new Scanner(System.in);
		comidantaria = sc.nextDouble();
		System.out.println("Ahora cuantos animales de la misma especie hay");
		numanimales = sc.nextInt();
		System.out.println("Y por último la media de lo que come cada animal");
		kilosporAnimal = sc.nextDouble();
	}
	
}
