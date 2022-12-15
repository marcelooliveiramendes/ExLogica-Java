package faccat;

import java.util.Scanner;

public class VendaMacas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de maçãs: ");
		int quant = sc.nextInt();

		float preco = 1.30f;
		float resultado;
		if (quant <= 12) {
			resultado = quant*preco;
		} else {
			preco = 1.00f;
			resultado = quant*preco;
		}
		
		System.out.printf("Quantidade: %d", quant);
		System.out.printf("Total: %f", resultado);
		sc.close();
		
	}

}
