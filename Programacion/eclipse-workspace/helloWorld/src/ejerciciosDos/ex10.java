package ejerciciosDos;

public class ex10 {

	public static void main(String[] args) {
		
		int	tir1, tir2, tir3;
		int	auxMayor, auxMenor;
		
		System.out.println("A continuación mostraré 3 tiradas de dados, y te diré cual es mayor y cual es menor");
		
		tir1	=	(int)(Math.random() * 6 + 1);
		tir2	=	(int)(Math.random() * 6 + 1);
		tir3	=	(int)(Math.random() * 6 + 1);
		
		System.out.println("La tirada 1 es: " + tir1);
		System.out.println("La tirada 2 es: " + tir2);
		System.out.println("La tirada 3 es: " + tir3);
		
		auxMayor = (tir1 > tir2 ? tir1: tir2);
		auxMayor = (auxMayor > tir3 ? auxMayor : tir3);
		
		auxMenor = (tir1 < tir2 ? tir1 : tir2);
		auxMenor = (auxMenor < tir3 ? auxMenor : tir3);
		
		System.out.println("La tirada mayor es " + auxMayor);
		System.out.println("La tirada menor es " + auxMenor);
	}
	
}
