package capitulo2;

public class Imc {
	
	private double height;
	private double weight;	
	
	public Imc(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	// Método que calcula o IMC:
	public void imc() {
		double imc = weight / (this.height * this.height);
		System.out.printf("The value of your IMC is %.2f%n%n", imc);
		System.out.println("BMI Values");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:        30 or greater");		
	}
}
