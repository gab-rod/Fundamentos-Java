package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
	
//Neste caso utilizarei o While Indeterminado, a reprodução do while só irá parar quando for inserido o que está na condição ("0").

		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
			while (!texto.equalsIgnoreCase("0")) {
				System.out.println("Informe a opção desejada: ");
				texto = entrada.nextLine();
			}
			
			entrada.close();
	}
}
