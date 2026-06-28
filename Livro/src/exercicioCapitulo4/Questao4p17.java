package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int distanceTraveled = 0;
		int litersConsumed = 0;
		double averageConsumption = 0;
		int totalMileageSum = 0;
		int totalFuelConsumed = 0;
		
		System.out.print("Enter the first distance traveled or -1 to quit: ");
		distanceTraveled = input.nextInt();
		
		while (distanceTraveled != -1) {
			System.out.print("Enter the amount liters consumed: ");
			litersConsumed = input.nextInt();
			
			// Acumulando os totais
			totalMileageSum += distanceTraveled;
			totalFuelConsumed +=  litersConsumed;
			
			// Cálculo do consumo desta viagem específica
			double tripConsumption = (double) distanceTraveled / litersConsumed;
			
			// Cálculo da média geral até agora
			averageConsumption = (double) totalMileageSum / totalFuelConsumed;
			
			System.out.printf("%n--- TRIP REPORT ---%n");
		    System.out.printf("Consumption for this trip: %.2f km/l%n", tripConsumption);
		    System.out.printf("Current total mileage: %d km%n", totalMileageSum);
		    System.out.printf("Current total fuel: %d liters%n", totalFuelConsumed);
		    System.out.printf("Overall average so far: %.2f km/l%n%n", averageConsumption);
			
			
			System.out.print("Enter the distance traveled (or -1 to quit): ");
			distanceTraveled = input.nextInt();					
		}
		
		// Relatório final fora do while
		if (totalFuelConsumed != 0) { // Proteção contra divisão por zero se o usuário sair de cara
		    System.out.printf("%n=== FINAL TOTALS ===%n");
		    System.out.printf("Total distance: %d km%n", totalMileageSum);
		    System.out.printf("Total fuel: %d liters%n", totalFuelConsumed);
		    System.out.printf("Overall average: %.2f km/l%n", (double) totalMileageSum / totalFuelConsumed);
		} else {
		    System.out.println("No data was entered.");
		}			
	
	}
}
