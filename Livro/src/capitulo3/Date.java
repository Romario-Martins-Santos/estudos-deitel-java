// Exercício 3.14
package capitulo3;

public class Date {
	private int mes;
	private int dia;
	private int ano;
	
	public Date(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;				
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}

	public int getAno() {
		return ano;
	}	
	public void displayDate() {
		System.out.printf("%02d/%02d/%d%n", mes, dia, ano);
	}	
}
