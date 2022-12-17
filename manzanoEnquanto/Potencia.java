package manzanoEnquanto;

import java.util.Scanner;

public class Potencia {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();

		int potencia = 1;

		int i = 0;

		while (i <= expoente) {
			potencia = potencia * base;
			i++;
		}

		System.out.println(base+" ^ "+expoente+" = "+potencia);

		sc.close();
		
		
	}
	
}
