import java.util.Random;
import java.util.Scanner;

public class JogoCaraCoroa {
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		Scanner sc = new Scanner(System.in);
		
				
		
				//variaveis gerais	
		
		boolean venceu = false; //para implementar uma condicional de venceu e perdeu posteriormente
		int jogadas = 7; //quantas vezes a moeda é jogada
		int cara, coroa; //declarar mtas variaveis do mesmo tipo de uma vez
		cara = coroa = 0;  //atribuir valores a mtas variaveis do mesmo tipo de uma vez
		
	do {	
		
				//Entrada de Dados
		
		String escolha = ("");
		System.out.print("Escolha --- Cara ou Coroa: " );
		escolha = sc.next();
	
		for (int i = 1; i <= jogadas; i++) {
			
			int geradorRnd = aleatorio.nextInt(2)+1; //sorteia cara coroa 
			
			switch (geradorRnd) {
			
			case 1:
				cara++;
				break;				
			case 2:
				coroa++;
				break;				
			}
		
		}
		System.out.println("\nDeu cara " + cara + " vezes");
		
		System.out.println("Deu coroa " + coroa + " vezes");
		System.out.println("");
		
			switch (escolha.toUpperCase()){
			
			case "CARA":
				if (cara > coroa) {
					System.out.println("Você venceu!");
					venceu = true;
				}else{
					System.out.println("Você perdeu");
				}
			break;	
			
			case "COROA":
				if (coroa > cara) {
					System.out.println("Você venceu!");
					venceu = true;
				}else{
					System.out.println("Você perdeu");
				}
			break;	
			}
		
		cara = coroa = 0; //zera o contador para a nova tentativa	
			
		}while(venceu == false);	
	
	sc.close();
	}

}

