package capitulo6.exercicios.questao6p16;

import java.util.Scanner;

public class Questao6p16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro número [ou 0 para sair]: ");
		int n1 = input.nextInt();

		while (n1 != 0) {

			System.out.print("Digite o segundo número:  ");
			int n2 = input.nextInt();

			// Chamamos o método dentro do if ou direto na impressão

			if (IsMultiple(n1, n2)) {
				System.out.printf("%d É múltiplo de %d%n%n", n2, n1);
			} else {
				System.out.printf("%d NÃO é múltiplo de %d%n%n", n2, n1);
			}

			System.out.print("Digite o primeiro número [ou 0 para sair]: ");
			n1 = input.nextInt();
		}

		System.out.println("Programa encerrado.");
		input.close();
	}

	// Método que verifica se o segundo é múltiplo do primeiro
	public static boolean IsMultiple(int n1, int n2) {
		return n2 % n1 == 0;
	}
}
