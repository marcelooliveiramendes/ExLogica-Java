package lista03;

import java.util.Scanner;

public class SalarioNovo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario atual: ");
		float salario = sc.nextFloat();
		System.out.println("Percentual de reajuste: ");
		float reajuste = sc.nextFloat();

		float salarioNovo = salario + (salario/reajuste);

		System.out.println("Salario atualizado: "+salarioNovo);
		sc.close();
	}

}
