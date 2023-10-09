package helloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner hello = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		
		String nombre = hello.nextLine();
		System.out.println("Tu nombre es: " + nombre);

	}



}
