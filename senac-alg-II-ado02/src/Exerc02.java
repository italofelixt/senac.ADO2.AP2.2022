/*13. Implementar uma função que retorne um texto que represente a forma de um quadrado a partir da quantidade de linhas, conforme abaixo:
Exemplo: 4 linhas*/

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(System.in);

			System.out.println("** Forma Geométrica Quadrado **\n");

			System.out.println("Qual tamanho do lado do quadrado? ");
			int lado = input.nextInt();

			desenhaQuadrado(lado);

		} catch (Exception ex) {
			System.out.println("Ocorreu um erro:");
			System.out.println(ex.getMessage());
		}
	}

	public static void desenhaQuadrado(int lado) throws Exception {
		if (lado <= 0)
			throw new Exception("Tamanho Inválido");

		for (int i = 0; i < lado; i++) {
			System.out.println();

			for (int j = 0; j < lado; j++)
				System.out.print("* ");
		}
	}
}
