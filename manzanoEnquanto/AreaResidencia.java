package manzanoEnquanto;

import java.util.Scanner;

public class AreaResidencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean resposta = true;
		float altura;
		float comprimento;
		float area = 0;

		while (resposta == true) {
			System.out.printf("Digite o nome do comodo: ");
			String comodo = sc.nextLine();

			System.out.printf("Digite a altura do %s ", comodo);
			altura = sc.nextFloat();
			System.out.printf("Digite o comprimento do %s ", comodo);
			comprimento = sc.nextFloat();

			area = comprimento * altura;
			
			System.out.println("Possui mais algum comodo?");
			System.out.println("1 - Sim | 0 - Não");

			int res = sc.nextInt();
			if (res == 0) resposta = !resposta;
		}
		System.out.println("A �rea total de sua resid�ncia �: "+area+"m�");
		sc.close();

	}

}
