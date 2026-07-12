package capitulo5.exercicios;

public class Questao5p23a {

	public static void main(String[] args) {

		System.out.println("=== TESTANDO LETRA A ===");
		System.out.printf("%s\t%s\t%s\t%s%n", "X", "Y", "Orig", "DeMorgan");
		testarLetraA(3, 8);
		testarLetraA(3, 5);
		testarLetraA(6, 8);
		testarLetraA(6, 5);

		System.out.println("\n=== TESTANDO LETRA B ===");
		System.out.printf("%s\t%s\t%s\t%s\t%s%n", "A", "B", "G", "Orig", "DeMorgan");
		testarLetraB(2, 2, 5);
		testarLetraB(2, 3, 5);
		testarLetraB(2, 2, 4);
		testarLetraB(2, 3, 4);

		System.out.println("\n=== TESTANDO LETRA C ===");
		System.out.printf("%s\t%s\t%s\t%s%n", "X", "Y", "Orig", "DeMorgan");
		testarLetraC(5, 6);
		testarLetraC(9, 6);
		testarLetraC(5, 3);
		testarLetraC(9, 3);

		System.out.println("\n=== TESTANDO LETRA D ===");
		System.out.printf("%s\t%s\t%s\t%s%n", "I", "J", "Orig", "DeMorgan");
		testarLetraD(5, 5);
		testarLetraD(3, 5);
		testarLetraD(5, 8);
		testarLetraD(3, 8);
	}

	public static void testarLetraA(int x, int y) {
		boolean orig = !(x < 5) && !(y >= 7);
		boolean dm = !((x < 5) || (y >= 7));
		System.out.printf("%d\t%d\t%b\t%b%n", x, y, orig, dm);
	}

	public static void testarLetraB(int a, int b, int g) {
		boolean orig = !(a == b) || !(g != 5);
		boolean dm = !(a == b && g != 5);
		System.out.printf("%d\t%d\t%d\t%b\t%b%n", a, b, g, orig, dm);
	}

	public static void testarLetraC(int x, int y) {
		boolean orig = !((x <= 8) && (y > 4));
		boolean dm = x > 8 || y <= 4;
		System.out.printf("%d\t%d\t%b\t%b%n", x, y, orig, dm);
	}

	public static void testarLetraD(int i, int j) {
		boolean orig = !((i > 4) || (j <= 6));
		boolean dm = i <= 4 && j > 6;
		System.out.printf("%d\t%d\t%b\t%b%n", i, j, orig, dm);

	}
}