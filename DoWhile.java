package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

//Neste caso utilizarei o Do While. A reprodu��o do "Do" s� ir� ser encerrada quando a condi��o do While for realizada.
		
		Scanner entrada = new Scanner (System.in);

		String texto = "";
		
		do { 
			System.out.println("Voc� precisa falar "
					+ "as palavras m�gicas.");
			System.out.print("Quer sair? "); 
			
			texto= entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		
		entrada.close();
		
	}
}
