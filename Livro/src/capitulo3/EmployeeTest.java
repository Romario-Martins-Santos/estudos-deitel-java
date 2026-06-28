package capitulo3;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee funci1 = new Employee("Tobi", "Tobias", 5000.00);
		Employee funci2 = new Employee("Rosa", "preta", 6537.35);
		
		System.out.printf("O salário anual %s %s é: %.2f%n"
				+ "O salário anual de %s %s é: %.2f%n%n",
				funci1.getNome(),
				funci1.getSobrenome(),
				funci1.getSalarioAnual(),
				funci2.getNome(),
				funci2.getSobrenome(),
				funci2.getSalarioAnual());
		
		funci1.AplicarAumento(10);
		funci2.AplicarAumento(20);
				
		System.out.printf("O salário anual %s %s é: %.2f%n"
				+ "O salário anual de %s %s é: %.2f%n%n",
				funci1.getNome(),
				funci1.getSobrenome(),
				funci1.getSalarioAnual(),
				funci2.getNome(),
				funci2.getSobrenome(),
				funci2.getSalarioAnual());
	}
}
