package faccat;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em farenheit: ");
		int fahrenheit = sc.nextInt();

		float celsius = (fahrenheit-32)*5/9;

		System.out.printf("%f°C é igual a %f°F: ",celsius, fahrenheit);
		
		sc.close();
	}
	
}
