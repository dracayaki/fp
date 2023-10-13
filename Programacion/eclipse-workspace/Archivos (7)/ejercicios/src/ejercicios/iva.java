package ejercicios;

import java.util.Scanner;

/* 
Un economista te ha encargado un programa para realizar cálculos con el IVA. 
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
Muestra en pantalla el importe correspondiente al IVA y al total.
*/
public class iva {
	public static void main (String[] args) {
		
		float baseImp;
		float ivaApli;
		float aux;
		float total;
		
		
		//primero pedimos la base imponible
		System.out.println("Dime el precio del producto");
		//abrimos el scanner
		Scanner sc = new Scanner(System.in);
		//como queremos tratar con numeros usamos nextInt en lugar de nextLine
		baseImp = sc.nextFloat();

		//ahora pediremos el iva, continuamos con el scanner abierto
		System.out.println("A continuación introduce el IVA que se debe aplicar");
		ivaApli = sc.nextFloat();
		//cerramos scanner
		sc.close();
		
		//a continuación calculamos el iva que debemos sumarle
		// usando una regla de 3
		
		aux = (ivaApli * baseImp ) / 100;
		//calculamos el total
		total = baseImp + aux;
		
		System.out.println("El importe a sumar del IVA es: " + aux + " y el total: " + total + "€.");
	}
}
