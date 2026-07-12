package capitulo5.exercicios;

public class Questao5p19 {
	
	public static void main(String[] args) {
		
		// a)
		
		int i = 1, j = 2, k = 3, m = 2;
		
		System.out.println(i == 1); // True
		
		// b)
		System.out.println(j == 3);
		
		// c)
		System.out.println((i >= 1) && (j < 4));
		
		// d)
		System.out.println((m <= 99) & (k < m));
		
		// e)
		System.out.println((j >= i) || (k == m));
		
		// f)
		System.out.println((k + m < j) | (3 - j >= k));
		
		// g)
		System.out.println(!(k > m));
	}

}
