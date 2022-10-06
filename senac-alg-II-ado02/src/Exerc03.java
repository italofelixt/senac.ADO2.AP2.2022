/*14. Implementar uma função que retorne um texto que represente a forma de um retângulo 
   a partir da quantidade de linhas e colunas, conforme abaixo:
   Exemplo: 4 linhas e 2 colunas*/

import java.util.Scanner;

public class Exerc03 {
	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(System.in);

			System.out.println("** Forma Geométrica Retângulo **\n");

			System.out.println("Qual a largura do retângulo? ");
			int largura = input.nextInt();
			System.out.println("Qual a altura do retângulo? ");
			int altura = input.nextInt();
			
			desenhaRetangulo(largura, altura);

		} catch (Exception ex) {
			System.out.println("Ocorreu um erro!");
			System.out.println(ex.getMessage());
		}
	}

	public static void desenhaRetangulo(int largura, int altura) throws Exception {
		if (largura <= 0 || altura <= 0)
			throw new Exception("Tamanho Inválido");

		for (int i = 0; i < altura; i++) {
			System.out.println();

			for (int j = 0; j < largura; j++) {
				System.out.print("* ");
			}
		}
	}
}
