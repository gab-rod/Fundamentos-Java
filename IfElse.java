package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {

// Este programa receberá um número e realizará o calculo para descobrir se o número é impar ou par.
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Número Par");
		}
		else {
			System.out.println("Número ímpar");	
		}	
			
	}		
	}
