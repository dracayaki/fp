package ejerciciosDos;

public class ex09 {

	public static void main(String[] args) {
		
		double numAlea;
		String aux;
		
		System.out.println("En este programa generaré un número aleatorio, e indicaré si está más cerca de 1 o de 0");
		
		numAlea = Math.random();
		aux = (numAlea >= 0.5) ? "Es más cercano a 1" : "Es más cercano a 0";
		
		
		System.out.println(numAlea);
		System.out.println(aux);
		
	}
	
}
