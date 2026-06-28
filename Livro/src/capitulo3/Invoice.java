package capitulo3;
// Exercício 3.12

public class Invoice {
	
	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double precoItem;
	
	public Invoice(String numero, String descricao, int quantidadeComprada, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.precoItem = precoItem;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}	
	
	public double getInvoiceAmount() {
		if(quantidadeComprada < 0) {
			quantidadeComprada = 0;
		}	
		if(precoItem < 0) {
			precoItem = 0;
		}		
		return quantidadeComprada * precoItem;
	}
}
