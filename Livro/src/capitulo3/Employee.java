package capitulo3;
// Exercício 3.13

public class Employee {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Employee(String nome, String sobrenome, double  salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		// Validação: só aceita se for maior que zero
		if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		}
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal > 0) {
			this.salarioMensal = salarioMensal;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public double getSalarioAnual() {
		return salarioMensal * 12;
	}
	
	public void AplicarAumento(double porcentagem) {
		double fatorAumento = 1 + (porcentagem /100);
		this.salarioMensal = this.salarioMensal * fatorAumento;	
	}
}
