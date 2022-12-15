package lista01;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");

		int valor = sc.nextInt();

		System.out.println("Sucessor: "+ (valor + 1));

		sc.close();
	}
}
