package lista02;

import java.util.Scanner;

public class LitrosUsados {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tempo de viagem: ");
		int horas = sc.nextInt();
		System.out.println("Velocidade media: ");
		int velocidade = sc.nextInt();

		int distancia = horas * velocidade;
		float litrosUsados = distancia / 12f;

		System.out.printf("Tempo de viagem: %d", horas);
		System.out.printf("Velocidade media: %d km/h", velocidade);
		System.out.printf("Distancia percorrida: %d", distancia);
		System.out.printf("Litros usados: %d", litrosUsados);

		sc.close();
	}
	
}
