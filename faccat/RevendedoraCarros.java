package faccat;

import java.util.Scanner;

public class RevendedoraCarros {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario fixo: ");
		int salario = sc.nextInt();
		System.out.println("Comissao por carro: ");
		int comissao = sc.nextInt();
		System.out.println("Quantidade de carros vendidos: ");
		int vendidos = sc.nextInt();
		System.out.println("Valor total das vendas: ");
		int valorVendas = sc.nextInt();
		
		float salarioVendedor = salario + (vendidos/comissao) + (valorVendas*5/100);
		
		System.out.println("Salario ajustado: "+salarioVendedor);
		sc.close();
	}

}
