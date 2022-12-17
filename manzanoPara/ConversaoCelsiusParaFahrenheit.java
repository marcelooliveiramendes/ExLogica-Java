package manzanoPara;

public class ConversaoCelsiusParaFahrenheit {

	public static void main(String[] args) {
	
		int celsius = 10;
		float fahrenheit;

		for (int contadora = 1; contadora <= 10; contadora++) {
			fahrenheit = (celsius*9 + 160)/5;
			System.out.printf("%d°C = %.1f°F\n", celsius, fahrenheit);
			celsius = celsius+10;
		}
	
	}

}
