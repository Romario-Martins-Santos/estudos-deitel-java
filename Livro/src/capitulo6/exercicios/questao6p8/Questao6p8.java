package capitulo6.exercicios.questao6p8;

public class Questao6p8 {

	// Atributos baseados nas regras do enunciado
	private double tarifaMinima = 2.0;
	private double adicionalHora  = 0.5;
	private double tarifaMaxima = 10.0;

	// Método que calcula a tarifa de um cliente específico
	public double calculateCharges (double horas) {
		// Caso 1: Se ficou até 3 horas, paga apenas a taxa mínima
		if (horas <= 3) {
			return tarifaMinima;
		}	

		// Caso2: Se passou de 3 horas, calcula o adicional
		double horasExtras = horas - 3;
		double valorTotal = tarifaMinima + (adicionalHora * Math.ceil(horasExtras));

		// Aplica a trava do teto máximo de R$ 10,00
		if (valorTotal > tarifaMaxima) {
			valorTotal = tarifaMaxima;
		}

		return valorTotal;
	}	
}
