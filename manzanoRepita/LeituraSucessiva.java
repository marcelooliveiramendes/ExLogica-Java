package manzanoRepita;

import java.util.Scanner;

public class LeituraSucessiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor = 0, acumuladora = 0, lidos = 0;

		do {
			System.out.println("Digite um valor um valor: ");
			valor = sc.nextInt();

			if (valor>0) acumuladora += valor;
			lidos++;
		} while (valor>0);

		float media = acumuladora/lidos;

		System.out.println("Soma dos valores: " + acumuladora);
		System.out.println("Media dos valores: " + media);
		System.out.println("Quantidade de valores: " + lidos);

		sc.close();
	}

}
