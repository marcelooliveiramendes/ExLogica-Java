package faccat;

import java.util.Scanner;

public class L02E18_Votar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if (idade>=16) {
			System.out.println("Voc� pode votar");
		} else {
			System.out.println("Voc� n�o pode votar");
		}
		sc.close();

	}

}
