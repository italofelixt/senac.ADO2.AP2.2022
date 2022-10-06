/*12. Implementar uma função que retorne um texto que represente a forma de uma linha a partir do tamanho de pontos que a compõem, conforme abaixo:
Exemplo: 4 pontos
* * * *  */
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("** Forma Geometrica Linha **\n");
			
			System.out.print("Informe a largura da linha: ");
			int tamanho = input.nextInt();
			
			imprimirLinha(tamanho);
		} catch (Exception ex) {
			System.out.println("Ocorreu um erro: ");
			System.out.println(ex.getMessage());
		}

	}
	
	public static void imprimirLinha (int tamanho) throws Exception {
		if(tamanho <= 0) 
			throw new Exception ("Tamanho Inválido");
		
		
		for( int i = 1; i <= tamanho; i++) {
			System.out.print("* ");		
			
		}
		System.out.println();
	}

}
