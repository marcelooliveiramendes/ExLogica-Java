package lista02;

import java.util.Scanner;

public class LataOleo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor do raio: ");
		int raio = sc.nextInt();
		System.out.println("Valor da altura: ");
		int altura = sc.nextInt();

		float pi = 3.14f;
		float volume = pi * (raio*raio) * altura;

		System.out.println("Volume da lata de oleo: " + volume);
		
		sc.close();
	}
	
}
