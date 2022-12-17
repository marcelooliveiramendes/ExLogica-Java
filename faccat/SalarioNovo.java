package faccat;

import java.util.Scanner;

public class SalarioNovo {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite o salario: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste: ");

		int reajuste = sc.nextInt();

		float novoSalario = salario+(salario/reajuste);

		System.out.println("Salario atualizado: " + novoSalario);
		
		sc.close();
		
	}
}
