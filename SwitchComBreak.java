package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

//Neste caso utilizarei o Switch com Break, ser� inserido uma nota e a mesma ser� qualificada de acordo com a condi��o que lhe atender�.
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C"; 
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		default:
			conceito = "inv�lido";
			break;
		}
		
		System.out.println("Conceito � " + conceito);
		
		entrada.close();
		
	}
}
