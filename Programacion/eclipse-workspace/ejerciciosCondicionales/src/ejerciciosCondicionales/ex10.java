package ejerciciosCondicionales;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		int respuesta;
		int nota;
		
		System.out.println("Responde el siguiente cuestionario y al final te diré la nota");
		
		System.out.println("Pregunta 1:");
		System.out.println("Menciona cual es la estructura de un comentario para una sola línea");
		System.out.println("1. /* */");
		System.out.println("2. //");
		System.out.println("3. %/");
		System.out.println("4. /** */");
		
		nota = 0;
		Scanner sc = new Scanner(System.in);
		respuesta = sc.nextInt();
		if (respuesta == 2) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 2:");
		
		System.out.println("Menciona cual es la estructura de un comentario para una o varias línea");
		System.out.println("1. /* */");
		System.out.println("2. //");
		System.out.println("3. %/");
		System.out.println("4. /** */");
	
		respuesta = sc.nextInt();
		
		if (respuesta == 1) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 3:");
		
		System.out.println("Menciona cual es la estructura de un comentario de documento, de una o más líneas");
		System.out.println("1. /* */");
		System.out.println("2. //");
		System.out.println("3. %/");
		System.out.println("4. /** */");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 4) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 4:");
		
		System.out.println("¿Cual es la forma correcta de declarar el método main?");
		System.out.println("1. public void main(String args)");
		System.out.println("2. public static void main(String[] args)");
		System.out.println("3. static public void main(String[] args)");
		System.out.println("4. public static String main(String[] args");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 2) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 5:");
		
		System.out.println("El llamado de una libreria se hace usando el");
		System.out.println("1. import");
		System.out.println("2. scanner");
		System.out.println("3. string");
		System.out.println("4. ninguno de las anteriores");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 1) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		
		System.out.println("Pregunta 6:");
		
		System.out.println("Como se captura lo que se escribe en pantalla");
		System.out.println("1. integer");
		System.out.println("2. printf");
		System.out.println("3. if");
		System.out.println("4. scanner");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 4) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 7:");
		
		System.out.println("Para mostrar mensajes en pantallas se usa");
		System.out.println("1. System.out.println");
		System.out.println("2. system.out.printer");
		System.out.println("3. System.out.prin");
		System.out.println("4. ninguna de las anteriores");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 1) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 8:");
		
		System.out.println("Un String es para definir variables o constantes de tipo");
		System.out.println("1. caracter");
		System.out.println("2. decimales");
		System.out.println("3. entero");
		System.out.println("4. todas las anteriores");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 3) {
			nota += 1;
		} else {
			nota +=0;
		}
		
		System.out.println("Pregunta 9:");
		
		System.out.println("Un String es para definir variables o constantes de tipo");
		System.out.println("1. caracter");
		System.out.println("2. decimales");
		System.out.println("3. entero");
		System.out.println("4. todas las anteriores");
		
		respuesta = sc.nextInt();
		
		if (respuesta == 3) {
			nota += 1;
		} else {
			nota +=0;
		}
	}
	
}
