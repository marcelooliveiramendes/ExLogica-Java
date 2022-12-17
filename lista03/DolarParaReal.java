package lista03;

import java.util.Scanner;

public class DolarParaReal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dolares que você tem: ");
		int dolar = sc.nextInt();
		System.out.println("Cotação atual: ");
		float conversao = sc.nextFloat();
		float real = dolar/conversao;
		System.out.printf("%d dolares é igual a %.2f reais", dolar, real);
		sc.close();

	}

}
