package capitulo6.exercicios.questao6p12;

import java.security.SecureRandom;

public class Questao6p12 {
	
	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();		
					
		//int n = 1 + randomNumbers.nextInt(2); // a)
		
		//int n = 1 + randomNumbers.nextInt(100); // b)
		
		//int n = randomNumbers.nextInt(10); // c)
		
		//int n = 1000 + randomNumbers.nextInt(113); // d)
		
		//int n = -1 + randomNumbers.nextInt(3); // e)
		
		int n = -3 + randomNumbers.nextInt(15); // f)
		
		System.out.println(n);						
	}
}
