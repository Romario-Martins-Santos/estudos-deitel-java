package capitulo6.exercicios.questao6p15;

import java.util.Scanner;

public class Questao6p15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe o lado1: ");
		double side1 = input.nextDouble();

		System.out.print("informe o lado2: ");
		double side2 = input.nextDouble();
		
		double hipotenusa = hypotenuse(side1, side2);

		System.out.printf("O valor da hipotenusa do triângulo cujo lados forma informados é %.2f",
				hipotenusa);
		
		input.close();		
	}	

	public static double hypotenuse(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));		
	}
}
