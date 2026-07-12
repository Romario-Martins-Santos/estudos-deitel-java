package capitulo4.exercicios;

import java.util.Scanner;

public class Questao4p19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double fixedSalary = 200.00;
		double sale = 0.00;
		double commissionRate = 0.00;
		double commissionTotal = 0.00;
		double salaryTotal = 200.00;
		double totalSales = 0.00;
		int totalItems = 0;
		
		System.out.print("Enter value first sale: ");
		sale = input.nextDouble();
		
		while (sale != -1) {
			commissionRate = sale * 0.09;
			commissionTotal += commissionRate;
			totalSales += sale;
			totalItems++;
			System.out.print("Enter value next sale: ");
			sale = input.nextDouble();			
		}
		
		salaryTotal = fixedSalary + commissionTotal;
		
		
		System.out.println();
		
		System.out.printf("The employee's weekly fixed salary R$%.2f%n", fixedSalary);
		System.out.printf("Total commission of employee on week was R$%.2f%n", commissionTotal);
		System.out.printf("The earnings of Seller on week was R$%.2f%n", salaryTotal);
		System.out.printf("The total items sold was %d%n ", totalItems);
		System.out.printf("The total sales was R$%.2f", totalSales);		
	}
}
