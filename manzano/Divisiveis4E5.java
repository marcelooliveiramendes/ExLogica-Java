package manzano;

import java.util.Scanner;

public class Divisiveis4E5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		
		int valor = sc.nextInt();
		if ((valor%4 == 0) && (valor%5 == 0)) {
			System.out.println("O n�mero informado � divis�vel por 4 e 5");
		} else {
			System.out.println("O n�mero informado n�o � divis�vel por 4 e 5");
		}
		sc.close();
	}

}
