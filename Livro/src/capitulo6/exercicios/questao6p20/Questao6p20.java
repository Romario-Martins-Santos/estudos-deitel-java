package capitulo6.exercicios.questao6p20;

import java.util.Scanner;

public class Questao6p20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double raio = 0;

		System.out.print("Informe o valor do raio ou [-1] para finalizar:  ");
		raio = input.nextDouble();

		while (raio != -1) {			

			System.out.printf("A área do círculo com o raio informado é %.2f%n%n", circleArea(raio));

			System.out.print("Informe o valor do raio ou [-1] para finalizar:  ");
			raio = input.nextDouble();
		}

		input.close();
	}

	public static double circleArea(double raio) {
		return Math.PI * raio * raio;
	}
}
