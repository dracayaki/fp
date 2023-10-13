package ejercicios;

import java.util.Scanner;

/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a
 *  calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas
 *   (cuyo número será introducido por el usuario). Existen dos tipos de entradas: infantiles, 
 *   que cuestan 15,50 €; y de adultos, que cuestan 20 €.

En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente
 un bono descuento del 5 %.

 * 
 */
public class parqueAcuatico {

	
	public static void main(String[] args) {
		
		int niños, adultos;
		double precioNiño,precioAdulto, descuento,totalImporte, aux;
		System.out.println("Dime cuantos niños y cuantos adultos hay");
		Scanner sc = new Scanner(System.in);
		niños = sc.nextInt();
		adultos = sc.nextInt();
		sc.close();
		
		precioNiño = 15.50;
		precioAdulto = 20;
		descuento = 0.05;
		
		totalImporte = niños * precioNiño + adultos * precioAdulto;
		if (totalImporte >=100) {
			aux = totalImporte * descuento;
			totalImporte -= aux;
		}
		System.out.println("El importe total es: " + totalImporte  + " euros.");
	}
}
