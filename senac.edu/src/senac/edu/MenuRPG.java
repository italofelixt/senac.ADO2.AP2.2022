package senac.edu;

import java.util.Scanner;

public class MenuRPG {

	 public static void main(String[] args) {

	    /*System.out.println("1 - Instru��es");
	    System.out.println("2 - Jogar");
	    System.out.println("3 - Cr�ditos");
	    System.out.println("4 - Sair");*/

	    
	    
	    System.out.println("-----Menu-----\n"+"1 - Instru��es\n"+"2 - Jogar\n"+"3 - Cr�ditos\n"+"4 - Sair " );
	    
	    
	      
	    

	    Scanner entrada = new Scanner(System.in); 
	    int opcao;
	    
	    do{ 
	    System.out.print("Digite a op��o desejada: ");   
	    opcao = entrada.nextInt();
	 
	    
	      switch (opcao) {

	        case 1:
	          System.out.println("Op��o 1 - Instru��es");
	          break;
	        case 2:
	          System.out.println("Op��o 2 - Jogar");
	          break;
	        case 3:
	          System.out.println("Op��o 3 - Cr�ditos");
	          break;
	        case 4:
	          System.out.println("Op��o 4 - Sair \n"
	                            +"Voc� saiu do menu.");
	          break;
	       
	        default:
	          System.out.println("Op��o inv�lida.");
	      }    
	   
	    }while(opcao != 4); 
	    
	    
	    entrada.close();
	 
	 }
	 
}
	
