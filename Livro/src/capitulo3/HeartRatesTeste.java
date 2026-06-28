package capitulo3;

import java.util.Scanner;

public class HeartRatesTeste {
	
	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String nome = input.next();
		
		System.out.print("Enter your last name: ");
		String sobrenome = input.next();
		
		System.out.print("Enter your birth mouth: ");
		int mes = input.nextInt();
		
		System.out.print("Enter you birth day: ");
		int dia = input.nextInt();
		
		System.out.print("Enter your birth year: ");
		int ano = input.nextInt();
		
		HeartRates heartRates = new HeartRates(nome, sobrenome, mes, dia, ano);				
		
		System.out.printf("%s | %s | Nascimento: %02d/%02d/%d%n", 
				heartRates.getNome(),
				heartRates.getSobrenome(),
				heartRates.getMes(),
				heartRates.getDia(),
				heartRates.getAno());
		
		int age = heartRates.age();		
		
		System.out.printf("Sua idade é %d%n", age);
		System.out.printf("Sua frequência cardíaca máxima é %d%n", heartRates.maximumHeartRate());
		System.out.printf("Sua frequência cardíaca alvo está entre %s", heartRates.getTargetHeartRate());
	}
}
