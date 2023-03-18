import java.util.*;
import java.io.*;



public class d2 {
	public static void main(String[] args) {
		List<Integer> horas = new ArrayList<>(Arrays.asList(100,6,4,10,10,8,9,6,8,6,4,10,10,8,9,6));
		resultado(horas);
		
	}
	
	public static void resultado(List<Integer> horasTrabalho) {
		int horasTotal = 0;
		
		for(int i = 0; i < horasTrabalho.size(); i++) {
			horasTotal += horasTrabalho.get(i);
		}
		
		if(horasTotal > 160) {
			int trabalhou = horasTotal;
			horasTotal -= 160;
			System.out.println("parabens voce vai receber o seu salario e tera que trabalhar " + horasTotal+ " horas a menos mes que vem");
		} else if(horasTotal == 160) {
			System.out.println("parabens cumpriu suas horas voce vai receber o seu salario");
		} else {
			int dever = 160;
			dever -= horasTotal;
			System.out.println("voce deve repor "+ dever+" horas para ter o seu salario corretamente depositado");
		}
	}
}
