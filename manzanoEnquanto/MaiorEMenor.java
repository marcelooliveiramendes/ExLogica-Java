package manzanoEnquanto;

import java.util.Scanner;

public class MaiorEMenor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = 0, maior = 0, menor = 127;

		while (valor >= 0) {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();

			if (maior < valor) maior = valor;
			if (valor < menor && valor >= 0) menor = valor;
		}

		System.out.println("Maior "+maior);
		System.out.println("Menor: "+menor);
		sc.close();

	}

}
