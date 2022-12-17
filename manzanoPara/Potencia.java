package manzanoPara;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();

		int potencia = 1;
		System.out.println(base+" ^ 0 = 1");

		for (int i = 1; i <= expoente; i++) {
			potencia = potencia * base;
			System.out.println(base+" ^ "+i+" = "+potencia);
		}
		sc.close();
	}

}
