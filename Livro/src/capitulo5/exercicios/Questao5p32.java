package capitulo5.exercicios;

import java.util.Scanner;

public class Questao5p32 {
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.println("        ESTIMADOR DE IMPOSTO - FAIRTAX EUA         ");
        System.out.println("====================================================\n");
        
        // Solicita as despesas nas categorias solicitadas pelo Deitel
        System.out.print("Informe seus gastos com Moradia: R$ ");
        double moradia = input.nextDouble();
        
        System.out.print("Informe seus gastos com Alimentação: R$ ");
        double alimentacao = input.nextDouble();
        
        System.out.print("Informe seus gastos com Vestuário: R$ ");
        double vestuario = input.nextDouble();
        
        System.out.print("Informe seus gastos com Transporte: R$ ");
        double transporte = input.nextDouble();
        
        System.out.print("Informe seus gastos com Educação: R$ ");
        double educacao = input.nextDouble();
        
        System.out.print("Informe seus gastos com Assistência Médica: R$ ");
        double saude = input.nextDouble();
        
        System.out.print("Informe seus gastos com Férias: R$ ");
        double ferias = input.nextDouble();
        
        // Calcula o total gasto pelo usuário
        double totalGastos = moradia + alimentacao + vestuario + transporte + educacao + saude + ferias;
        
        System.out.println("\n----------------------------------------------------");
        System.out.printf("Total Geral de Despesas: R$ %.2f%n", totalGastos);
        System.out.println("----------------------------------------------------");
        
        // -------------------------------------------------------------
        // CÁLCULO DOS IMPOSTOS (Visão Pró e Contra do FairTax)
        // -------------------------------------------------------------
        System.out.println("\nCálculo do imposto \"tax-inclusive\" (Proposta Oficial):");
        double taxInclusive = totalGastos * 0.23;
        System.out.printf("A carga estimada de imposto (23%% do preço final) é: R$ %.2f%n", taxInclusive);    
        
        System.out.println("\nCálculo do imposto \"tax-exclusive\" (Crítica / Equivalente de Vendas):");
        double taxExclusive = totalGastos * 0.30; 
        System.out.printf("A taxa equivalente cobrada sobre o valor limpo (30%%) seria: R$ %.2f%n", taxExclusive);
        
        System.out.println("====================================================");
        
        input.close(); // Fecha o Scanner com segurança
	}
}
