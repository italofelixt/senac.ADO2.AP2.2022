package senac.edu;

import java.util.Scanner;

public class MenuRPG {

	 public static void main(String[] args) {

	    /*System.out.println("1 - Instruções");
	    System.out.println("2 - Jogar");
	    System.out.println("3 - Créditos");
	    System.out.println("4 - Sair");*/

	    
	    
	    System.out.println("-----Menu-----\n"+"1 - Instruções\n"+"2 - Jogar\n"+"3 - Créditos\n"+"4 - Sair " );
	    
	    
	      
	    

	    Scanner entrada = new Scanner(System.in); 
	    int opcao;
	    
	    do{ 
	    System.out.print("Digite a opção desejada: ");   
	    opcao = entrada.nextInt();
	 
	    
	      switch (opcao) {

	        case 1:
	          System.out.println("Opção 1 - Instruções");
	          break;
	        case 2:
	          System.out.println("Opção 2 - Jogar");
	          break;
	        case 3:
	          System.out.println("Opção 3 - Créditos");
	          break;
	        case 4:
	          System.out.println("Opção 4 - Sair \n"
	                            +"Você saiu do menu.");
	          break;
	       
	        default:
	          System.out.println("Opção inválida.");
	      }    
	   
	    }while(opcao != 4); 
	    
	    
	    entrada.close();
	 
	 }
	 
}
	
