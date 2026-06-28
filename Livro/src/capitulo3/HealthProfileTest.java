package capitulo3;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.next();
		
		System.out.print("Enter your lastName: ");
		String lastName = input.next();
		
		System.out.print("Enter your gender[F/M]: ");
		String gender = input.next();
		
		System.out.print("Enter your birth mounth: ");
		int mounth = input.nextInt();
		
		System.out.print("Enter your birth day: ");
		int day = input.nextInt();
		
		System.out.print("Enter your birth year: ");
		int year = input.nextInt();
		
		System.out.print("Enter your heigth: ");
		double height = input.nextDouble();
		
		System.out.print("Enter your weigth: ");
		double weight = input.nextDouble();
		
		HealthProfile hp = new HealthProfile(name, lastName, gender, mounth, day, year, height, weight);
		
		System.out.printf("Name: %s %s%n"
				+ "Gender: %s%n"
				+ "Date of birth: %02d/%02d/%d%n"
				+ "Height: %.2f%n"
				+ "Weight: %.2f%n%n",
				name, lastName, gender, mounth, day, year, height, weight);
		
		System.out.printf("Age: %d years%n", hp.age());
		
		hp.calcularEClassificarIMC();
		
		System.out.printf("The interval of frequency maximum is %d%n", hp.maximumHeartRate());
		
		System.out.printf("The frequency heart target is %s between", hp.getTargetHeartRate());
		
	}
}
