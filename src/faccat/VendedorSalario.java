package faccat;

import java.util.Scanner;

public class VendedorSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salario: ");
		short salario = sc.nextShort();
		System.out.println("Total de vendas: ");
		short totalVendas = sc.nextShort();

		if (totalVendas <= 1500) {
			int novoSalario = salario + (totalVendas*3/100);
			System.out.println("Salario atualizado: "+novoSalario);
		} else {
			int novoSalario = salario+(totalVendas*5/100);
			System.out.println("Salario atualizado: "+novoSalario);
		}
		sc.close();

	}

}
