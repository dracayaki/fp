package ejerciciosDos;
import java.time.LocalDate;

public class ex12 {
public static void main(String[] args) {
	
	System.out.println("Te diré que día de la semana era el primer día del mes de Septiembre del año 2020");
	
	LocalDate fechaDate = LocalDate.of(2020, 9, 1);
	
	System.out.println(fechaDate.getDayOfWeek());
}
}
