package faccat;

import java.util.Scanner;

public class Votar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if (idade>16) {
			System.out.println("Voce pode votar");
		} else if (idade>=16 && idade<= 18) {
			System.out.println("Voto facultativo");
		} else if (idade<65) {
			System.out.println("Voto obrigatorio");
		} else {
			System.out.println("Voto facultativo");
		}
		sc.close();

	}

}
