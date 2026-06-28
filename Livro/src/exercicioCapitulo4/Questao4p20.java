package exercicioCapitulo4;

import java.util.Scanner;

public class Questao4p20 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double hoursWorked = 0.0; // horas trabalhadas
		int workSchedule = 40; // jornada normal de trabalho
		double overtime = 0.0; // quantidade de horas extras trabalhadas
		double normalNumberHours  = 0.0; // quantidade de horas normais trabalhadas
		double hourlyWage = 0.0; // // valor da hora normal trabalhada
		double grossSalaryAmount = 0.0; // valor do salário bruto
		int id = 0; // ID do funcionário
		
		System.out.print("Enter ID employee: ");
		id = input.nextInt();
		
		while (id != -1) {
			System.out.print("Enter hours worked: ");
			hoursWorked = input.nextDouble();
			
			System.out.print("Enter hourly Wage: ");
			hourlyWage = input.nextDouble();
			
			// Caso o empregado faça menos de 40 horas semanais, seu salário será:
			if (hoursWorked < 40) {
				grossSalaryAmount = hoursWorked * hourlyWage;
			} else {
			
			// Cálculo da quantidade de horas extras feitas pelo empregado:
			overtime = hoursWorked - workSchedule;
			
			// Cálculo da quantidade de horas normais feitas pelo empregado:
			normalNumberHours = hoursWorked - overtime;
			
			// Cálculo do salário bruto do empregado:
			
			grossSalaryAmount = (normalNumberHours * hourlyWage) + (overtime * hourlyWage * 1.5);
			}
			
			System.out.println();
			
			System.out.println("Employee / Gross Salary Amount");
			System.out.printf("   %d            %.2f%n", id, grossSalaryAmount);
			
			System.out.println();
			
			System.out.print("Enter ID employee: ");
			id = input.nextInt();
		}		
	}
}
