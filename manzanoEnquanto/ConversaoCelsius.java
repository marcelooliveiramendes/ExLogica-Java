package manzanoEnquanto;

public class ConversaoCelsius {

	public static void main(String[] args) {
		
		int contadora = 1;
		int celsius = 10;
		float fahrenheit;

		while (contadora <= 10) {
			fahrenheit = (9*celsius+160)/5;
			System.out.printf("%d°C = %.1f°F\n", celsius, fahrenheit);
			celsius += 10;
			contadora++;
		}

	}

}
