/*Implemente um programa em Java que a partir de um número informado pelo
usuário, escreva no terminal os números contando de 0 até o número informado */

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("** Contagem Progressiva **\n");

		int numero = 0;

		System.out.println("Digite um número para ver sua contagem até esse número:");

		numero = input.nextInt();

		contarProgFor(numero);

	}

	public static void contarProgFor(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
	}
}

