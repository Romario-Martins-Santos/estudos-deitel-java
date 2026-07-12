package capitulo5.exercicios;

public class Questao5p26 {

	public static void main(String[] args) {

		int count; // variável de controle também utilizada depois que loop termina

		for (count = 1; (count <= 10) && (count != 5) ; count++) { // faz o loop 10 vezes		

			System.out.printf("%d ", count);	
		}	

		System.out.printf("%nBroke out of loop at count = %d%n", count);	
	}
}
