
package capitulo5.exercicios;

public class Questao5p20 {
	
	public static void main(String[] args) {
		
		double pi = 0.0; // Nosso acumulador
		double denominador = 1.0; // Começa em 1
		int sinal = 1; // 1 para somar, -1 para subtrair
		
		System.out.printf("%s\t\t%s%n", "Termo", "Valor de Pi");
		System.out.println("-----------------------------------");
		
		// O loop vai calcular 200.000 termos
		for (int termo = 1; termo <= 200000; termo++) {
			
			// Faz a conta da rodada atual e acumula em "pi"
			pi += sinal * (4.0 / denominador);
			
			// Imprime alguns termos para a tabela não ficar gigantesca na tela
			// (vamos imprimir de 20.000 em 20.000 para acompanhar a evolução
			if (termo % 20000 == 0) {
				System.out.printf("%d\t\t%.5f%n", termo, pi);				
			}
			
			// PREPARA AS VARIÁVEIS PARA A PRÓXIMA RODADA:
			denominador += 2.0; // O de baixo pula de 2 em 2 (1, 3, 5, 7, ...)
			sinal *= -1; // O sinal inverte: se  era 1 vira -1, se era -1 vira 1
		}
	}
}
