package lista02;

import java.util.Scanner;

public class TrocarValores {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		int num2 = sc.nextInt();

		System.out.println("Primeiro valor: " + num1);
		System.out.println("Segundo valor: " + num2);
		System.out.println("____________________________");
		
		int valorTemp = num1;
		num1 = num2;
		num2 = valorTemp;
		System.out.println("Primeiro valor: " + num1);
		System.out.println("Segundo valor: " + num2);
		sc.close();
	}
	
}
