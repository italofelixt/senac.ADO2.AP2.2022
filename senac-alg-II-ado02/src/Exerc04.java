//15. Implementar uma função que retorne um texto que represente a forma de um triângulo a
//    partir da quantidade de linhas, conforme abaixo:
//Exemplo: 5 linhas

//*
//* *
//* * *
//* * * * 
//* * * * *  

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(System.in);

			System.out.println("** Forma Geométrica Triângulo **\n");

			System.out.println("Qual a quantidade de linhas? ");
			int linhas = input.nextInt();

			desenhaTriangulo(linhas);

		} catch (Exception ex) {
			System.out.println("Ocorreu um erro!");
			System.out.println(ex.getMessage());
		}
	}

	public static void desenhaTriangulo(int linhas) throws Exception {
		if (linhas <= 0)
			throw new Exception("Tamanho Inválido");

		for (int i = 0; i < linhas; i++) { // loop que "pula linha"
			System.out.println("");

			for (int j = 0; j < i; j++) { // loop que imprime os ***
				System.out.print("* ");
			}
		}
	}
}
