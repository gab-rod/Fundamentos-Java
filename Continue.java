package controle;

public class Continue {
	public static void main(String[] args) {
	 
// Neste caso utilizarei o Continue com a função de indicar os momentos em que a condição poderá ser realizada ou não.
		for (int i = 0; i < 10; i++) {
			if (i % 2 ==1) {
				continue;
			
			}
			System.out.println(i);
		}
}
}
