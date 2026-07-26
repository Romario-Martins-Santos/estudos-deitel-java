package capitulo6.exercicios.questao6p13;

import java.security.SecureRandom;

public class Questao6p13 {

	public static void main(String[] args) {
		
		SecureRandom randomNumber = new SecureRandom();
		
		//int n =  2 * (1 + randomNumber.nextInt(5)); // a)
		
		// int n = 3 + 2 * randomNumber.nextInt(5); // b)
		
		int n = 6 + 4 * randomNumber.nextInt(5);
		
		System.out.println(n);
		
	}
}
