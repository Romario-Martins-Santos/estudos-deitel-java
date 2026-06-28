package capitulo3;

public class InvoiceTest {
	
	public static void main(String[] args) {
		
		Invoice fatura = new Invoice("001", "mouse", 2, -45.90);
		
		System.out.printf("Numero: %s | Descricao: %s | Quantidade Comprada: %d | Preço: %.2f%n",
				fatura.getNumero(),
				fatura.getDescricao(),
				fatura.getQuantidadeComprada(),
				fatura.getPrecoItem());
		
		System.out.printf("O valor total da fatura é %.2f", fatura.getInvoiceAmount());
	}
}
