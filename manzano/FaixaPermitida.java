package manzano;

import java.util.Scanner;

public class FaixaPermitida {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if ((numero>=1) && (numero<=9)) {
			System.out.println("O n�mero "+numero+" est� dentro da faixa permitida");
		} else {
			System.out.println("O n�mero "+numero+" n�o est� dentro da faixa permitida");
		}
		sc.close();
		
	}
	
}
