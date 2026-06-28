package capitulo3; 

public class HealthProfile {
	 
	private String name;
	private String lastName;
	private String gender;
	private int mounth;
	private int day;
	private int year;
	private double height;
	private double weight;
	
	public HealthProfile(String name, String lastName, String gender, int mounth, 
			int day, int year, double height, double weight) {
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.mounth = mounth;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;		
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGender() {
		return gender;
	}

	public int getMounth() {
		return mounth;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMounth(int mounth) {
		this.mounth = mounth;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// Calcula a idade em anos
	public int age() {
		return 2026 - year;
	}
	
	// Calcula intervalo de frequência cardíaca máxima
	public int maximumHeartRate() {
		return 220 - age();
	}
	
	// Calcula frequência cardíaca alvo
	public String getTargetHeartRate() {
	    double min = maximumHeartRate() * 0.5;
	    double max = maximumHeartRate() * 0.85;
	    // Retorna os dois valores formatados em um único texto
	    return String.format("%.2f - %.2f", min, max);
	}

	// Único método que calcula e classifica o IMC
    public void calcularEClassificarIMC() {
        double imc = weight / (height * height);

        System.out.printf("Your IMC is %.2f%n per minute", imc);

        if (imc < 18.5) {
            System.out.println("Classification: Underweight");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classification: Normal");
        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println("Classification: Overweight");
        }
        if (imc >= 30) {
            System.out.println("Classification: Obesity");
        }
    }	
}
