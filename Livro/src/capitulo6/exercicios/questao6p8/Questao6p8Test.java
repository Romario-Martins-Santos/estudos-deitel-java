package capitulo6.exercicios.questao6p8;

import java.util.Scanner;

public class Questao6p8Test {
	
	public static void main(String[] args) {
		
		Questao6p8 estacionamento = new Questao6p8();		
		Scanner input = new Scanner(System.in);
		
		double faturamentoTotal = 0.0;  // Acumulador para o total do dia
		double horas;
		
		System.out.println("--- Sistema do Estacionamento ---");
        System.out.println("(Digite -1 a qualquer momento para encerrar o dia)\n");
        
        while (true) {
        	System.out.print("Informe o tempo de estacionamento em horas para o cliente: ");
            horas = input.nextDouble();
            
            // Condição de parada: se digitar -1, o loop quebra
            if (horas == -1) {
            	break;
            }
            
            // Calcula a tarifa do cliente atual usando o seu método
            double valorCliente = estacionamento.calculateCharges(horas);
            
            // Soma o valor do cliente atual no faturamento total do dia
            faturamentoTotal += valorCliente;
            
            // Exibe o recibo do cliente atutal
            System.out.printf("Cliente atual ficou %.1f horas. Tarifa: R$ %.2f%n%n", horas, valorCliente);            
        }
		
     // Quando o loop quebra, exibimos o fechamento do caixa
        System.out.println("---------------------------------");
        System.out.printf("FIM DO EXPEDIENTE. Total arrecadado ontem: R$ %.2f%n", faturamentoTotal);
        
        input.close();
	}
}