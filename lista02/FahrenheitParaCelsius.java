package lista02;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		float fahrenheit = sc.nextFloat();
		float celsius = (fahrenheit - 32) * 5/9;
		System.out.printf("%f°F é igual a %f°C: ", fahrenheit, celsius);
		sc.close();
	}
	
}
