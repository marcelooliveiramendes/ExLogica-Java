package faccat;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		byte valor1 = sc.nextByte();
		System.out.println("Digite o segundo valor: ");
		byte valor2 = sc.nextByte();
		
		if (valor1==valor2) {
			System.out.println("Numeros iguais");
		} else if (valor1>valor2) {
			System.out.println("Primeiro valor e maior");
		} else {
			System.out.println("Segundo valor e maior");
		}
		sc.close();

	}

}
