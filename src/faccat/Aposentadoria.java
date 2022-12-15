package faccat;

import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu codigo: ");
		short codigo = sc.nextShort();
		
		System.out.println("Ano de nascimento: ");
		short anoNascimento = sc.nextShort();
		System.out.println("Ano atual: ");
		short anoAtual = sc.nextShort();
		System.out.println("Ano de admissão: ");
		short admissao = sc.nextShort();
		
		int idade = anoAtual - anoNascimento;
		
		int tempoTrabalhado = anoAtual - admissao;
		
		if (idade >= 60 && tempoTrabalhado >= 25) {
			System.out.printf("Funcionario %d pode requerer sua aposentadoria", codigo);
		} else {
			System.out.printf("Funcionario %d não pode requerer sua aposentadoria", codigo);
		}
		sc.close();
	}

}
