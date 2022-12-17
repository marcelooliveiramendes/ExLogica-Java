package faccat;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código: ");
		short usuario = sc.nextShort();
		System.out.println("Digite a senha: ");
		short senha = sc.nextShort();
		
		if (usuario != 1234) {
			System.out.println("Usuario incorreto!");
		} else if (senha != 9999) {
			System.out.println("Senha incorreta!");
		} else {
			System.out.println("Acesso permitido!");
		}
		
		sc.close();
	}

}
