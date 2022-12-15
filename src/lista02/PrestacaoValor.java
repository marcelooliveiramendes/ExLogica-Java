package lista02;

import java.util.Scanner;

public class PrestacaoValor {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor a pagar: ");
		float valor = sc.nextFloat();
		System.out.println("Porcentagem por atraso: ");
		int taxa = sc.nextInt();
		System.out.println("Meses de atraso: ");
		int meses = sc.nextInt();

		float prestacao = valor + (valor*taxa/100) * meses;

		System.out.println("Valor a pagar atualizado: " + prestacao);
		
		sc.close();
	}
	
}
