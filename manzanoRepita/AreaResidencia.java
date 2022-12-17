package manzanoRepita;

import java.util.Scanner;

public class AreaResidencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean resposta = true;
		float altura;
		float comprimento;
		float area;
		int acumuladora = 0;
		
		do{
			System.out.printf("Digite o nome do comodo: ");
			String comodo = sc.nextLine();

			System.out.printf("Digite a altura do %s ", comodo);
			altura = sc.nextFloat();
			System.out.printf("Digite o comprimento do %s ", comodo);
			comprimento = sc.nextFloat();

			area = comprimento * altura;
			acumuladora += area;
			
			System.out.println("Possui mais algum comodo?");
			System.out.println("1 - Sim | 0 - Não");
			int res = sc.nextInt();

			if(res != 1) resposta = false;
				
			
		} while (resposta == true);
		System.out.println("Area total: "+acumuladora+"m");
		sc.close();
	}

}
