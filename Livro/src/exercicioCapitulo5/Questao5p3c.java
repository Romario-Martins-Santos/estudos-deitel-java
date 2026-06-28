package exercicioCapitulo5;

public class Questao5p3c {
	
	public static void main(String[] args) {
		
		int i;
		i = 1;
		
		while (i <= 20) {			
			System.out.print(i); // Imprime apenas o número primeiro
			
			// agora decide o que vem DEPOIS do número
			if (i % 5 == 0) {
				System.out.println(); // se for múltiplo de 5, pula a linha
			} else {
				System.out.print("\t"); // Caso contrário, dá a tabulação
			}
			i++;
		}		
	}
}