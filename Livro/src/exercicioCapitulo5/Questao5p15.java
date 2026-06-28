package exercicioCapitulo5;

public class Questao5p15 {
	
	public static void main(String[] args) {		
		
		System.out.println("(a)");
		
		// Loop externo: controla as 10 linhas
		for (int linha = 1; linha <= 10; linha++) {
			
			// Loop interno: imprime asteriscos baseado no número da linha
			for (int coluna = 1; coluna <= linha; coluna++) {
				
				System.out.print("*"); // Imprime lado a lado
			}
			
			System.out.println(); // Quando termina a linha, pula para a próxima
		}
		
		
		System.out.println("(b)");
		
		// Loop externo: Começa na linha 10 e  vai descendo até a linha 1 (10, 9, 8, 7 ...)
		for (int linha = 10; linha >= 1; linha--) {
			
			// Loop interno: roda a quantidade de vezes do valor atual da "linha"
			for (int coluna = 1; coluna <= linha; coluna++) {
				
				System.out.print("*"); // Imprime apenas UM asterisco por vez
			}
			
			System.out.println(); // Pula de linha				
		}	
		
		
		System.out.println("(c)");
		
		// Loop externo: controla as 10 linhas (de 1 a 10)
		for (int linha = 1; linha <= 10; linha++) {
			
			// 1° Loop interno: imprime os espaços em branco
			// Na linha 1, não entra aqui (1 < 1 é falso). Na linha 2, roda 1 vez...
			for (int espaco = 1; espaco < linha; espaco++) {
				System.out.print(" ");
			}
			
			// 2° Loop interno: imprime os asteriscos
			// Quantidade de asteriscos é sempre (11 - número da linha)
			// Ex.: Linha 1 precisa de 10 asteriscos (11 - 1 = 10)
			for (int asterisco = 1; asterisco <= (11 - linha); asterisco++) {
				System.out.print("*");
			}
			
			// Depois de imprimir espaços e asteriscos daquela linha, pula para a próxima
			System.out.println();
		}	
		
		
		System.out.println("(d)");
		
		// Loop externo: controla as 10 linhas (de 1 a 10)
		for (int linha = 10; linha >= 1; linha--) {
			
			// 1° Loop interno: imprime espaços em branco
			// Na linha 1, imprime 9 espaços em branco e um *
			for (int espaco = 1; espaco < (linha); espaco++) {
				System.out.print(" ");
			}
			
			for (int asterisco = 10; asterisco >= (linha); asterisco--) {
				
				System.out.print("*");
				
			}			
				
			System.out.println();
		}		
	}
}

















