package faccat;

import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		
		if (valor>=0) {
			System.out.println("Valor positivo");
		} else {
			System.out.println("Valor negativo");
		}
		sc.close();

	}

}
