/*Achar o fatorial de um dado número usando uma função recursiva*/

import java.util.Scanner;
public class Exerc06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("** Fatorial **\n");

		int numero = 0;

		System.out.println("Digite um numero para saber o fatorial:");

		numero = input.nextInt();

		int numeroFatorial = fatorarFor(numero);

		System.out.println("O fatorial de " + numero + " é: " + numeroFatorial);
	}

	public static int fatorar(int n) { 			// usando recursão
		if (n == 1) {
			return 1;
		}
		return n * fatorar(n - 1);
	}

	public static int fatorarFor(int n) { 		// usando looping for
		int fat = 1;

		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		return fat;
	}
}
