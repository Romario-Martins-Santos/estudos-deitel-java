package exercicioCapitulo5;

public class Questao5p14 {
	
	public static void main(String[] args) {
		
		double amount; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; //quantia inicial antes dos juros
		
		// LOOP EXTERNO: Varia a taxa de juros de 5% (0.05) até 10%(0.10)
		for (double rate = 0.05; rate <= 0.10; rate += 0.01) {
			
			// Imprime um cabeçalho bonitinho para destacar a taxa atual
			System.out.printf("%n--- Calculando para a taxa de %.0f%% ---%n", rate * 100);
			System.out.printf("%s%20s%n", "Year", "Amount on deposit");
			
			// LOOP INTERNO: Calcula a quantidade de depósito para cada um dos dez anos
			for (int year = 1; year <= 10; ++year) {
				
				// Calcula nova quantidade durante o ano especificado
				amount = principal * Math.pow(1.0 + rate, year);
				
				// exibe o ano e a quantidade
				System.out.printf("%4d%,20.2f%n", year, amount);
			}
		}				
	}
}
