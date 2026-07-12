package capitulo5.exercicios;

public class Questao5p3d {
	
	public static void main(String[] args) {
		
		int i;
				
		for (i = 1; i <=20; i++) {
			
			System.out.printf("%2d", i);
			
			if (i % 5 != 0) {
				System.out.print("\t");				
			} else {
				System.out.println();
			}
		}
	}
}














