package faccat;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		
		int antecessor = sc.nextInt() - 1;

		System.out.println("Antecessor: " + antecessor);
		sc.close();
	}
}
