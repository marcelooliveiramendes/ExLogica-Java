package lista02;

import java.util.Scanner;

public class votacaoEleitores {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de votos brancos: ");
		float brancos = sc.nextFloat();
		
		System.out.println("Informe a quantidade de votos nulos: ");
		float nulos = sc.nextFloat();
		
		System.out.println("Informe a quantidade de votos v�lidos: ");
		float validos = sc.nextFloat();

		float eleitores = validos + brancos + nulos;

		validos = validos / eleitores * 100;
		brancos = brancos / eleitores * 100;
		nulos = nulos / eleitores * 100;
		
		System.out.printf("Votos validos: %.2f% \n", validos);
		System.out.printf("\nVotos brancos: %.2f% \n", brancos);
		System.out.printf("Votos nulos: %.2f% \n", nulos);
		sc.close();
	}

}
