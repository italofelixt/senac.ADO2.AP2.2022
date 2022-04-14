import java.util.Random;


public class JogoDeDados {
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int jogadas = 1000; //quantas vezes o dado é jogado
		int face1, face2, face3, face4, face5, face6; //declarar mtas variaveis do mesmo tipo de uma vez
		face1 = face2 = face3 = face4 = face5 = face6 = 0;  //atribuir valores mtas variaveis do mesmo tipo de uma vez
				
		for (int i = 1; i <= jogadas; i++) {
			
			int faceGeradora = aleatorio.nextInt(6)+1; //sorteia uma face de 0 a 5 por isso deve-se somar 1 para ser de 1 a 6
			
			switch (faceGeradora) {
			
			case 1:
				face1++;
				break;				
			case 2:
				face2++;
				break;				
			case 3:
				face3++;
				break;				
			case 4:
				face4++;
				break;				
			case 5:
				face5++;
				break;
			case 6:
				face6++;
				break;
			}
			
		}
		System.out.println("A face 1 apareceu " + face1 + " vezes, ou seja: " 
				+ 100 * (double)face1/jogadas + "%"); //calculo de porcentagem e tranformando o int em double (casting)
						
		System.out.println("A face 2 apareceu " + face2 + " vezes, ou seja: "
				+ 100 * (double)face2/jogadas + "%");
		
		System.out.println("A face 3 apareceu " + face3 + " vezes, ou seja: "
				+ 100 * (double)face3/jogadas + "%");
		
		System.out.println("A face 4 apareceu " + face4 + " vezes, ou seja: "
				+ 100 * (double)face4/jogadas + "%");
		
		System.out.println("A face 5 apareceu " + face5 + " vezes, ou seja: "
				+ 100 * (double)face5/jogadas + "%");
		
		System.out.println("A face 6 apareceu " + face6 + " vezes, ou seja: "
				+ 100 * (double)face6/jogadas + "%");
	}

}
