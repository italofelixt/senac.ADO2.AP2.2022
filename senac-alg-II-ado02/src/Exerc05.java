
//16. Implementar uma função que retorne um texto que represente a forma de um triângulo invertido
//	  a partir da quantidade de linhas, conforme abaixo:
//	  Exemplo: 5 linhas
//  	        *
//      	  * *
//    		* * *
//  	  * * * *
//		* * * * *
import java.util.Scanner;
public class Exerc05 {
	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(System.in);

			System.out.println("** Forma Geométrica Triângulo Invertido **\n");

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

		int i, j, row = linhas;
		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
