package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String tempo = "3 meses";
		
//Neste caso utilizarei o Switch sem Break. O resultado dependerá do valor informado na String.
		
		switch (tempo.toLowerCase()) {
	
		case "1 ano":
			System.out.println("Sei Hardflip");
		case "9 meses":
			System.out.println("Sei Shove-it HeelFlip");
		case "6 meses":
			System.out.println("Sei Varial Flip");
		case "3 meses":
			System.out.println("Sei Flip");
		case "1 mês":
			System.out.println("Sei Ollie");
		}
		
	}
}
