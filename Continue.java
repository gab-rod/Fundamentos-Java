package controle;

public class Continue {
	public static void main(String[] args) {
	 
// Neste caso utilizarei o Continue com a fun��o de indicar os momentos em que a condi��o poder� ser realizada ou n�o.
		for (int i = 0; i < 10; i++) {
			if (i % 2 ==1) {
				continue;
			
			}
			System.out.println(i);
		}
}
}
