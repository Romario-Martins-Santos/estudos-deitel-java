package exercicioCapitulo5;

import java.util.Scanner;

public class Questao5p17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		double totalVendas = 0; // Acumulador para o valor total	
		
		// Primeira leitura (antes de entrar no loop)					
		System.out.print("Digite o número do produto [1 a 5] ou -1 para sair: ");
		int numeroProduto = input.nextInt(); 		
		
		while (numeroProduto != -1) {

			// Se o usuário não digitou -1, aí sim pedimos a quantidade
			System.out.print("Digite a quantidade vendida: ");
			int quantidadeVendida = input.nextInt();
			
			// O SWITCH ENTRA AQUI!
			// Ele analisa o número do produto e aplica o preço correto
			switch (numeroProduto) {
				case 1:
					totalVendas += quantidadeVendida * 2.98;
					break;
				case 2:
					totalVendas += quantidadeVendida * 4.50;
					break;
				case 3:
					totalVendas += quantidadeVendida * 9.98;
					break;
				case 4:
					totalVendas += quantidadeVendida * 4.49;
					break;
				case 5:
					totalVendas += quantidadeVendida * 6.87;
					break;
				default:
					System.out.println("Produto inválido! Digite um número de 1 a 5.");
					break;				
			}
			
			System.out.println("---------------------------------------------------");
			// LEITURA DE ATUALIZAÇÃO: Pede o próximo produto para continuar ou sair
			System.out.println("Digite o próximo número do produto (1 a 5) ou -1 para sair:");
			numeroProduto = input.nextInt();
		}
		
		// Exibe  o resultado final com duas casas decimais
		System.out.printf("%nO valor total de mercadorias vendidas foi: R$ %,.2f%n", totalVendas);		
	}
}
