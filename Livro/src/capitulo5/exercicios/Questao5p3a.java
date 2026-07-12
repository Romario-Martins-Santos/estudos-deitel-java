package capitulo5.exercicios;

public class Questao5p3a {	
	
	public static void main(String[] args) {
		
		int sum = 0;	
		int count;
		
		for (count = 1; count <= 99; count++) {
			if (count % 2 == 1) {
				sum += count;
			}
		}
		System.out.print(sum);

		
	}
		
}
