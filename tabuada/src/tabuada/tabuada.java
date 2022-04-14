package tabuada;

import java.util.Scanner;


public class tabuada {

	public static void main(String[] args) {
		
		int tabuada, multiplicador, limite;
		
		//tabuada é o numero que irá se repetir e multiplicar pelo multiplicador em todas as linhas
		//enquanto o multiplicador é o numero que irá incrementar a cada linha
		
		limite=10;
		multiplicador=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a tabuada desejada: ");
		
		tabuada = sc.nextInt();
		
		while (multiplicador <= limite) {
			System.out.println(tabuada + " x " + multiplicador + " = " + tabuada*multiplicador);
			multiplicador++;
		}
			
		sc.close();
	}
	
}
