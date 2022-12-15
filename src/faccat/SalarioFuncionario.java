package faccat;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.println("Digite o valor por hora: ");
		int valorHora = sc.nextInt();

		float salario = 160 * valorHora;
		float extra;

		if (horas>160) {
			extra = horas-160;
			float salarioExtra = extra * (valorHora + (valorHora - 50/100));
			salario= salario+(salarioExtra/2);
			System.out.println("Salario atualizado: "+salario);
		} else {
			System.out.println("Salario atualizado: "+salario);
		}

		sc.close();
	}

}
