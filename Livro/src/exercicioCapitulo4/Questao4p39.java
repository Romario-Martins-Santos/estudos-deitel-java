// calcule o crescimento demográfico mundial anual dos próximos 75 anos
// Imprima os resultados em uma tabela
// A primeira coluna deve exibir os anos do ano 1 ao ano 75
// A segunda coluna deve exibir a população mundial esperada no fim desse ano
// A terceira deve exibir o aumento numérico na população mundial que ocorreria nesse ano
// Utilizando os seus resultados, determine o ano em que a população dobraria com relação ao número de hoje se a taxa 
// de crescimento do ano atual persistisse.

package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p39 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a população mundial atual (em bilhões): ");
        double currentWorldPopulation = input.nextDouble();
        
        System.out.print("Digite a taxa de crescimento anual (em %, ex: 0,84): ");
        double annualGrowthRatePercent = input.nextDouble();
        
        double annualGrowthRate = 1 + (annualGrowthRatePercent / 100);
        double originalPopulation = currentWorldPopulation; 
        
        System.out.println("\n--- Relatório de 75 Anos ---");
        System.out.printf("%-6s %-30s %-25s%n", "Ano", "Pop. Esperada (bi)", "Aumento Anual (bi)");

        int year = 1;
        // 1. Loop principal para o relatório de 75 anos
        while (year <= 75) {
            double expectedPopulation = currentWorldPopulation * annualGrowthRate;
            double increase = expectedPopulation - currentWorldPopulation;

            System.out.printf("%-6d %-30.2f %-25.2f%n", year, expectedPopulation, increase);

            currentWorldPopulation = expectedPopulation; 
            year++;
        }

        // 2. Lógica do Rodapé: Continuar calculando até dobrar
        // Resetamos as variáveis para o cálculo da dobra sem afetar o relatório acima
        double popParaDobra = originalPopulation;
        int anoDaDobra = 0;
        
        while (popParaDobra < (originalPopulation * 2)) {
            popParaDobra *= annualGrowthRate;
            anoDaDobra++;
            
            // Segurança para evitar loop infinito se a taxa for zero ou negativa
            if (annualGrowthRate <= 1) {
                anoDaDobra = -1; 
                break;
            }
        }

        System.out.println("---------------------------------------------------------------------------");
        
        if (anoDaDobra != -1) {
            System.out.printf("RODAPÉ INFORMATIVO: A população dobrará em %d anos (atingindo %.2f bi).%n", 
                               anoDaDobra, popParaDobra);
        } else {
            System.out.println("RODAPÉ INFORMATIVO: Com taxa zero ou negativa, a população nunca dobrará.");
        }
        
        input.close();
    }
}