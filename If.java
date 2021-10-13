package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
// Neste caso iremos receber duas notas, calcularemos a média e qualificaremos entre Aprovado, Reprovado ou Nota incorreta.
		
		double media = 0;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.print("Parabéns");}
			
		if (media > 10)
			System.out.print("Nota incorreta");
		
		boolean criterioReprovacaoAtingido = media < 7;
		if (criterioReprovacaoAtingido)
			System.out.print("Reprovado");
		
		
		entrada.close();
		
	}
}
