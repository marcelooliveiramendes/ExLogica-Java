package lista02;

import java.util.Scanner;

public class SalarioAtual {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite o seu salario: ");
		float salario = sc.nextFloat();
		System.out.println("Percentual de reajuste: ");
		int reajuste = sc.nextInt();

		float novoSalario = salario+(salario/reajuste);

		System.out.println("Salario atualizado: " + novoSalario);
		
		sc.close();
		
	}
}
