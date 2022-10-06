/*Implemente um programa em Java que a partir de um número informado pelo
usuário, escreva no terminal os números contando de forma regressiva até o 0. */

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("** Contagem Regressiva **\n");

		int numero = 0;

		System.out.println("Digite um numero para ver sua contagem regressiva:");

		numero = input.nextInt();

		contarRegrFor(numero);

	}

	public static int contarRegr(int n) {
		if (n == -1) {
			return 0;
		}
		System.out.println(n);
		return contarRegr(n - 1);
	}

	public static void contarRegrFor(int n) {
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
