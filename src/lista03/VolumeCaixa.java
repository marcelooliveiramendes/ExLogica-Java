package lista03;

import java.util.Scanner;

public class VolumeCaixa {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o comprimento: ");
		int comprimento = sc.nextInt();
		System.out.println("Informe o altura ");
		int altura = sc.nextInt();
		System.out.println("Informe o largura: ");
		int largura = sc.nextInt();

		int volume = comprimento * altura * largura;
		
		System.out.println("Volume da caixa: " + volume);

		sc.close();
	}
}
