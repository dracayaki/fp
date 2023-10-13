package ejerciciosDos;
import java.time.LocalDate;

public class ex11 {

	public static void main(String[] args) {
		
		System.out.println("Nací el 25 de septiembre del 2000, a continuación crearé un programa que dirá que dia de la semana era");
		LocalDate fecha = LocalDate.of(2000, 9, 25);
		
		System.out.println(fecha.getDayOfWeek());
	
	}
	
}
