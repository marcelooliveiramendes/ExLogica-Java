package manzanoPara;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		int tabuada;
		for (int contadora = 0; contadora <= 10; contadora++) {
			tabuada = numero * contadora;
			System.out.printf("%d x %d = %d\n", numero, contadora, tabuada);
		}
		sc.close();
	}

}
