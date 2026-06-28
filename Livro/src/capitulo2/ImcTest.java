package capitulo2;

import java.util.Scanner;

public class ImcTest {
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your height: ");
		double height = input.nextDouble();
		
		System.out.print("Enter your weight: ");
		double weight = input.nextDouble();
		
		Imc imc = new Imc(height, weight);
		
		imc.imc();
	}
}
