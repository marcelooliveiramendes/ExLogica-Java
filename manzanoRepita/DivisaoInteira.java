package manzanoRepita;

import java.util.Scanner;

public class DivisaoInteira {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		System.out.print("Digite o segundo número: ");
		float num2 = sc.nextFloat();

		do {
			num1 = num1 / num2;
			System.out.println(num1);
		} while (num1 >= num2);
		sc.close();
	}

}
