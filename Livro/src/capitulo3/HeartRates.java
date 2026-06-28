package capitulo3;

public class HeartRates {

	private String nome;
	private String sobrenome;
	private int mes;
	private int dia;
	private int ano;
	
	public HeartRates(String nome, String sobrenome, int mes, int dia, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
	
	public int age() {
		return 2026 - ano;
	}
	
	public int maximumHeartRate() {
		return 220 - age();
	}
	
	public String getTargetHeartRate() {
	    double min = maximumHeartRate() * 0.5;
	    double max = maximumHeartRate() * 0.85;
	    // Retorna os dois valores formatados em um único texto
	    return String.format("%.2f - %.2f", min, max);
	}
}
