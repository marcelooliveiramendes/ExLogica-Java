package faccat;

import java.util.Scanner;

public class SomaMaiores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		byte a = sc.nextByte();
		System.out.println("Digite o segundo valor: ");
		byte b = sc.nextByte();
		System.out.println("Digite o terceiro valor: ");
		byte c = sc.nextByte();
		int soma;
		
		if ((a>b) && (b>c)) {
			soma = a+b;
			System.out.printf("%d + %d = %d ", a, b, soma);
		} else if ((a>c) && (c>b)) {
			soma = a+c;
			System.out.printf("%d + %d = %d ", a, c, soma);
		} else if ((b>a) && (a>c)) {
			soma = b+a;
			System.out.printf("%d + %d = %d ", b, a, soma);
		} else if ((b>c) && (c>a)) {
			soma = b+c;
			System.out.printf("%d + %d = %d ", b, c, soma);
		} else if ((c>a) && (a>b)) {
			soma = c+a;
			System.out.printf("%d + %d = %d ", c, a, soma);
		} else {
			soma = c+b;
			System.out.printf("%d + %d = %d ", c, b, soma);
		}
		sc.close();
	}

}
