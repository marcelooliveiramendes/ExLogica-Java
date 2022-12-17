package faccat;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		int nota1 = sc.nextInt();
		System.out.println("Segunda nota: ");
		int nota2 = sc.nextInt();
		
		int media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("O aluno foi aprovado");
		} else {
			System.out.println("O aluno foi reprovado");
		}
		sc.close();
		

	}

}
