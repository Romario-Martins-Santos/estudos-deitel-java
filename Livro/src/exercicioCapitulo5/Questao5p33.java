package exercicioCapitulo5;

public class Questao5p33 {

	public static void main(String[] args) {

		double usuarios = 1.0; // Começa com 1 bilhão em outubro de 2012
		double taxa = 0.04;    // 4% ao mês
		int mes = 0;           // Contador de meses

		boolean alcalcou1_5 = false;
		boolean alcancou2_0 = false;

		System.out.println("=============================================================");
		System.out.println("       PROJEÇÃO DE CRESCIMENTO DE USUÁRIOS - FACEBOOK   ");
		System.out.println("=============================================================\n");

		// O loop continua rodando enquanto não atingirmos os 2 bilhões

		while (usuarios < 2.0) {
			mes++; // Passou-se um mês

			// Aplica a fórmula de crescimento composto mês a mês
			usuarios = usuarios * (1 + taxa);

			// Verificação para a primeira meta: 1.5 bilhão
			if (usuarios >= 1.5 && !alcalcou1_5) {
				System.out.printf("Meta de 1,5 bilhão atingida no mês: %d (Total: %.3f bilhões)%n", mes, usuarios);
				alcalcou1_5 = true; // Marca como verdadeiro para não imprimir de novo no próximo mês
			}

			// Verificação para a segunda meta: 2.0 bilhão
			if (usuarios >= 2.0 && !alcancou2_0) {
				System.out.printf("Meta de 2 bilhões atingida no mês: %d (Total: %.3f bilhões)%n", mes, usuarios);
				alcancou2_0 = true; // Marca como verdadeiro para não imprimir de novo no próximo mês	

			}
			}
		}
	}

