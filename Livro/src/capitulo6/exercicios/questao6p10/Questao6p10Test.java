package capitulo6.exercicios.questao6p10;

import java.util.Scanner;

public class Questao6p10Test {
    
    public static void main(String[] args) {
        
        Questao6p10 arredondamento = new Questao6p10();
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Informe o número para arredondamento ou [-1] para finalizar: ");
            double x = input.nextDouble();
            if (x == -1) {
                System.out.println("Programa encerrado!");
                break;
            }
            
            // 1. Chamamos os métodos corretos e guardamos os resultados nas nuvens do Java
            double inteiro    = arredondamento.roundToInteger(x);
            double decimo     = arredondamento.roundToTenths(x);
            double centesimo  = arredondamento.roundToHundredths(x);
            double milesimo   = arredondamento.roundToThousandths(x);
            
            // 2. Agora sim, exibimos os resultados calculados PELOS SEUS MÉTODOS!
            System.out.printf("Original: %f%n", x);
            System.out.printf(" -> Inteiro mais próximo:   %.0f%n", inteiro);
            System.out.printf(" -> Décimo mais próximo:    %.1f%n", decimo);
            System.out.printf(" -> Centésimo mais próximo: %.2f%n", centesimo);
            System.out.printf(" -> Milésimo mais próximo:  %.3f%n%n", milesimo);
        }        
    }
}