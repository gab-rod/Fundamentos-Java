package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {

// Este programa receber� um n�mero e realizar� o calculo para descobrir se o n�mero � impar ou par.
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("N�mero Par");
		}
		else {
			System.out.println("N�mero �mpar");	
		}	
			
	}		
	}
