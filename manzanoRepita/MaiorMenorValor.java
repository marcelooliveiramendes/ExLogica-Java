package manzanoRepita;

import java.util.Scanner;

public class MaiorMenorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor, maior = 0, menor = 0;
		
		do {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			if (valor > maior) {
				maior = valor;
			} else if (menor>valor && valor>=0){
				menor = valor;
			}
		} while (valor > -1);

		System.out.println("Maior valor: "+ maior);
		System.out.println("Menor valor: "+ menor);

		sc.close();
	}

}
