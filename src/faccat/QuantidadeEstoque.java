package faccat;

import java.util.Scanner;

public class QuantidadeEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do produto: ");
		String produto = sc.nextLine();
		System.out.println("Quantidade atual: ");
		short quantidadeAtual = sc.nextShort();
		System.out.println("Quantidade maxima: ");
		short quantidadeMax = sc.nextShort();
		System.out.println("Quantidade minima: ");
		short quantidadeMin = sc.nextShort();

		int media = (quantidadeMax+quantidadeMin)/2;
		if (quantidadeAtual>=media) {
			System.out.println("Nao efetuar compra!");
		} else {
			System.out.println("Efetuar a compra!");
		}
		sc.close();
	}

}
