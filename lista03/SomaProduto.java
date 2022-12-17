package lista03;

import java.util.Scanner;

public class SomaProduto {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		int num3 = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		int num4 = sc.nextInt();
		
		int produto = num1 * num3;
		int soma = num2 +num4;
		
		System.out.println("Produto do primeiro com o terceiro: "+produto);
		System.out.println("Soma do segundo com o terceiro: "+soma);
		sc.close();
	}
	
}
