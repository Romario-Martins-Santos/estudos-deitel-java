package exercicioCapitulo5;

public class Questao5p30 {
	
	private int accountNumber; // número da conta da apólice
	private String makeAndModel; // carro ao qual a apólice  é aplicada
	private String state; // abreviatura do estado com duas letras
		
	// construtor
	public Questao5p30 (int accountNumber, String makeAndModel, String state) 
	{
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		setState(state);		
	}
	
	// define o accountNumber
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	// retorna o accountNumber
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	
	// configura o makeAndModel
	public void setMakeAndModel(String makeAndModel) 
	{
		this.makeAndModel = makeAndModel;
	}
	
	// retorna o makeAndModel
	public String getMakeAndModel() 
	{
		return makeAndModel;
	}
	
	// define o estado
	public void setState(String state) 
	{
		// O IF testa se a Stgring fornecida é igual a alguma das siglas válidas
		if (state.equals("CT") || state.equals("MA") || state.equals("ME") ||
				state.equals("NH") || state.equals("NJ") || state.equals("NY") ||
				state.equals("PA") || state.equals("VT")) 
		{
			this.state = state;
		}
		else
		{
			// Se não for nenhum deles, cai no else e exibe erro solicitado
			System.out.println("Erro: Código de estado inválido para a região Nordeste dos EUA!");
			this.state = "Código Inválido"; // Evita que a variável fique nula!
		}		
	}
	
	// retorna o estado
	public String getState() 
	{
		return state;
	}
	
	// método predicado é retornado se o estado tem seguros "sem culpa"
	public boolean isNoFaultState() 
	{
		boolean noFaultState;
		
		// determina se o estado tem seguros de automóvel "sem culpa"
		switch (getState()) // obtém a abreviatura do estado do objeto AutoPolicy 
		{
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		
		return noFaultState;		
	}

}
