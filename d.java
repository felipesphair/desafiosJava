
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class d {
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>(Arrays.asList(8.5, 6.4, 5.0, 9.0, 10.0));
		exibeResultado(notas);

	}
	
	public static void exibeResultado(ArrayList<Double> Listanotas) {
		int aprovados = 0;
		int reprovados = 0;
		
		for(int i = 0; i < Listanotas.size(); i++) {
			if(Listanotas.get(i) >= 7) {
				aprovados += 1;
			} else {
				reprovados += 1;
			}
				
		}
		
		System.out.println("A qtd de aprovados e de: " + reprovados);
		System.out.println("A qtd de reprovados e de: " + reprovados);		
	}
}
