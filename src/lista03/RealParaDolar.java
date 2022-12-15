package lista03;

import java.util.Scanner;

public class RealParaDolar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de reais que você tem: ");
		int real = sc.nextInt();
		System.out.println("Cotação atual: ");
		float conversao = sc.nextFloat();
		
		float dolar = real*conversao;
		System.out.printf("%d reais é igual a %.2f dolares", real, dolar);
		sc.close();
	}

}
