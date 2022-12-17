package faccat;

import java.util.Scanner;

public class PositivoNegativoNeutro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		byte valor = sc.nextByte();
		
		if (valor>0) {
			System.out.println("Valor positivo");
		} else if (valor==0) {
			System.out.println("Valor neutro");
		} else {
			System.out.println("Valor negativo");
		}
		sc.close();

	}

}
