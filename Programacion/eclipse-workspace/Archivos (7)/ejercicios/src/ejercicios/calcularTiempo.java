package ejercicios;

import java.util.Scanner;

/*
 * 
Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.

 * */
public class calcularTiempo {
	public static void main(String[] args) {
		
		int sec, segundos, horas, minutos;
		
		System.out.println("Dime una cantidad de segundos, y te diré cuántas horas, minutos y segundos hay");
		Scanner sc = new Scanner(System.in);
		sec = sc.nextInt();
		sc.close();
		
		horas = sec / 3600;
		minutos = (sec % 3600) / 60;
		segundos = (sec % 3600) % 60;
		
		System.out.println("Son " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
		
		}
}
