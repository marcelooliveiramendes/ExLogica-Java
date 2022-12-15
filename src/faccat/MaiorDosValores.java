package faccat;

import java.util.Scanner;

public class MaiorDosValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro valor: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Maior: "+num1);
		} else {
			System.out.println("Maior: "+num2);
		}
		sc.close();

	}

}
