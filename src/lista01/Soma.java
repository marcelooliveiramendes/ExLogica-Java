package lista01;

import java.util.Scanner;

public class Soma {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = sc.nextInt();

		float resultado = num1 + num2;

		System.out.printf("%f + %f = %f", num1, num2, resultado);
		sc.close();
	}
}
