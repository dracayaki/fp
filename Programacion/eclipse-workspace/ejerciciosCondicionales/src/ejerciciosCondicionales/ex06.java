package ejerciciosCondicionales;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	
	int num, numAbs;	
		
	System.out.println("Dime un número y te diré su valor absoluto");
	
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	numAbs = (num<0) ? num*-1 : num;
	System.out.println("El valor absoluto es: " + numAbs);
	sc.close();
	}
	
}
