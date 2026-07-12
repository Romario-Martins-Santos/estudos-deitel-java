package capitulo5.exercicios;

public class Questao5p22 {
	
	public static void main(String[] args) {
		
		// Cabeçalho profissional com largura fixa de 15 caracteres para cada coluna
        System.out.printf("%-15s%-15s%-15s%-15s%n", "(A)", "(B)", "(C)", "(D)");
        System.out.println("------------------------------------------------------------");

        // LOOP PRINCIPAL: Controla as 10 linhas do relatório
        for (int i = 1; i <= 10; i++) {
            
            // --- TRIÂNGULO A ---
            String trianguloA = "";
            for (int j = 1; j <= i; j++) {
                trianguloA += "*";
            }
            System.out.printf("%-15s", trianguloA);
            
            
            // --- TRIÂNGULO B ---
            String trianguloB = "";
            for (int j = 1; j <= (11 - i); j++) {
                trianguloB += "*";
            }
            System.out.printf("%-15s", trianguloB);
            
            
            // --- TRIÂNGULO C ---
            String trianguloC = "";
            // Primeiro os espaços (i - 1)
            for (int j = 1; j <= (i - 1); j++) {
                trianguloC += " ";
            }
            // Depois os asteriscos (11 - i)
            for (int j = 1; j <= (11 - i); j++) {
                trianguloC += "*";
            }
            System.out.printf("%-15s", trianguloC);
            
            
            // --- TRIÂNGULO D ---
            String trianguloD = "";
            // Primeiro os espaços (10 - i)
            for (int j = 1; j <= (10 - i); j++) {
                trianguloD += " ";
            }
            // Depois os asteriscos (igual a i)
            for (int j = 1; j <= i; j++) {
                trianguloD += "*";
            }
            System.out.printf("%-15s", trianguloD);
            
            
            // FIM DA LINHA: Avança para a próxima linha do bloco completo
            System.out.println();
        }
	}
}
