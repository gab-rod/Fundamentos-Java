package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
	
//Neste caso utilizarei o While Indeterminado, a reprodu��o do while s� ir� parar quando for inserido o que est� na condi��o ("0").

		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
			while (!texto.equalsIgnoreCase("0")) {
				System.out.println("Informe a op��o desejada: ");
				texto = entrada.nextLine();
			}
			
			entrada.close();
	}
}
