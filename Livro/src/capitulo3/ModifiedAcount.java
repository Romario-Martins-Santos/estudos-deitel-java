// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor
// e método deposit que executa a validação
package capitulo3;
public class ModifiedAcount 
{
	private String name; // variável de instância
	private double balance; // variável de instância
	
	// Construtor de Account que recebe dois parâmetros
	public ModifiedAcount(String name, double balance) 
	{
		this.name = name; // atribui name à variável de instância name
		
		// valida que o balance é maior que 0.0; se não for;
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if (balance > 0.0) // se o saldo for válido
			this.balance = balance; // o atribui à variável de instância balance	
	}
	
	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) 
	{
		if (depositAmount > 0.0) // se depositAmount for válido
			balance = balance + depositAmount; //adiciona ao saldo
	}
	
	// método retorna o saldo da conta
	public double getBalance() 
	{
		return balance;
	}
	
	// método que retira  dinheiro de uma Account
	public void withdraw(double withdrawAmount) 
	{
        if (withdrawAmount > balance) 
            System.out.println("Withdrawal amount exceeded account balance");
        if (withdrawAmount <= balance)
        balance = balance - withdrawAmount;
	}
	
	// método que define o nome
	public void setName(String name) 
	{
		this.name = name;
	}
	
	// método que retorna o nome
	public String getName() 
	{
		return name; // retorna o valor de name ao chamado
	} // fim do método getName  	
} // fim da classe ModifiedAcount