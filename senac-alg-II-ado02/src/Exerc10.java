
/*Implemente um programa em Java que calcule uma potenciação a partir de um
número base e de um expoente.
Obs: Fazer com comando de repetição e recursão.*/
import java.util.Scanner;
public class Exerc10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("** Potenciação **\n");

		double base = 0;
		int expoente = 0;

		System.out.println("Digite um numero para ser a base: ");

		base = input.nextInt();

		System.out.println("Digite um número para ser o expoente: ");

		expoente = input.nextInt();

		double exp = potenciacao(base, expoente);

		System.out.println("O exponencial de " + base + " e expoente " + expoente + " é " + exp);
	}

	public static double potenciacao(double base, int expoente) {
		double pow = 0;
		if (expoente == 0) {
			return 1;
		}
		if (expoente > 0) {
			pow = base * potenciacao(base, expoente - 1);
		} else if (expoente < 0) {
			pow = 1 / potenciacao(base, expoente * -1);
		}
		return pow;
	}

	public static double potenciacaoFor(double base, int expoente) {
		double pot = 1;

		for (int i = 1; i <= Math.abs(expoente); i++) {
			pot = pot * base;
		}
		if (expoente < 0)
			pot = 1 / pot;
		return pot;
	}
}
