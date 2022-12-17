package faccat;

import java.util.Scanner;

public class IdadeDias {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos anos voce tem: ");
		int anos = sc.nextInt() * 365;
		
		System.out.println("Digite quantos meses voce tem: ");
		int meses = sc.nextInt() * 30;
		
		System.out.println("Digite quantos dias voce tem: ");
		int dias = sc.nextInt();
		
		int idade = anos+meses+dias;

		System.out.println("Dias de vida: "+idade);
		
		sc.close();
	}

}
