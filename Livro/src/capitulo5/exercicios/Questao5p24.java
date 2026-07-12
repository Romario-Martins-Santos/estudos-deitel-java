package capitulo5.exercicios;

public class Questao5p24 {
	
	public static void main(String[] args) {
		
		for (int linhaMetade1 = 1; linhaMetade1 <= 5; linhaMetade1 ++) {
			
			for (int espaco = 4; espaco >= linhaMetade1; espaco--) {
				
				System.out.print(" ");				
			}
			
			for (int asterisco = 1; asterisco <= (2 * linhaMetade1) - 1; asterisco++) {
				
				System.out.print("*");
			}			
			
			System.out.println();
		}
		
		for (int linhaMetade2 = 1; linhaMetade2 <= 4; linhaMetade2++) {
			
			for (int espaco2 = 1; espaco2 <= linhaMetade2; espaco2++) {
				
				System.out.print(" ");
			}
			
			for (int asterisco2 = 1; asterisco2 <= 9 - (2 * linhaMetade2); asterisco2++) {
				
				System.out.print("*");

			}
			
			System.out.println();
		}		
	}	
}
