package capitulo6.exercicios.questao6p9;

import java.util.Scanner;

public class Questao6p9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Arredondador de Números ---");
        System.out.println("(Digite -1 para sair)\n");
        
        while (true) {
            System.out.print("Informe o número para arredondar: ");
            double x = input.nextDouble();
            
            // Condição de parada (caso o usuário queira encerrar)
            if (x == -1) {
                break;
            }
            
            // A sua fórmula perfeita
            double y = Math.floor(x + 0.5);
            
            // Printf formatado para ficar bonito no console
            System.out.printf("Original: %.2f | Arredondado: %.0f%n%n", x, y);
        }
        
        System.out.println("Programa encerrado.");
        input.close();
    }
}