/*Achar a somatória de um dado número usando uma função recursiva*/

import java.util.Scanner;
public class Exerc07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("** Somatória **\n");

		int numero = 0;

		System.out.println("Vamos saber a somatória da sequência a partir de um número que você digitar\n\n"
				+ "Por exemplo, se digitar 5 será: 5 + 4 + 3 + 2 + 1 resultado 15.\n");
		System.out.print("Digite um numero: ");

		numero = input.nextInt();

		int numeroSomatoria = somaFor(numero);

		System.out.println("A somatória da sequência de " + numero + " é: " + numeroSomatoria);
	}

	public static int somar(int n) {
		if (n == 1) {
			return 1;
		}
		return n + somar(n - 1);
	}

	public static int somaFor(int n) {
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		return soma;
	}
}
