package faccat;

import java.util.Scanner;

public class SaldoConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da conta: ");
		String conta = sc.nextLine();
		System.out.println("Digite seu saldo: ");
		short saldo = sc.nextShort();
		System.out.println("Digite seu débito: ");
		short debito = sc.nextShort();
		System.out.println("Digite seu credito: ");
		short credito = sc.nextShort();

		int saldoAtual = saldo-debito+credito;

		if (saldoAtual>=0) {
			System.out.println("Número da Conta: "+conta +"\n");
			System.out.println("Seu saldo atual: "+saldoAtual +"\n");
			System.out.println("Status: Positivo");
		} else {
			System.out.println("Número da Conta: "+conta +"\n");
			System.out.println("Seu saldo atual: "+saldoAtual +"\n");
			System.out.println("Status: Negativo");
		}
		sc.close();
	}

}
