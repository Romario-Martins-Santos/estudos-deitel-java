package exercicioCapitulo5;

public class Questao5p30Teste {

	public static void main(String[] args) {	

		// cria dois objetos AutoPolicy
		Questao5p30 policy1 = 
				new Questao5p30(11111111, "Toyota Camry", "NJ");
		Questao5p30 policy2 = 
				new Questao5p30(22222222, "Ford Fusion", "RJ");

		// exibe se cada apólice está em um estado "sem culpa"
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);		
	}


	// método que mostra se um AutoPolicy
	// está em um estado com seguro de automóvel "sem culpa"
	public static void policyInNoFaultState(Questao5p30 policy) 
	{
		System.out.println("The Auto policy:");
		System.out.printf(
				"Account #: %d; Car: %s;%n State %s %s a no-fault state%n%n",
				policy.getAccountNumber(), policy.getMakeAndModel(),
				policy.getState(),
				(policy.isNoFaultState() ? "is": "is not"));
	}
}
