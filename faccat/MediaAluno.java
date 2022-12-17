package faccat;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeira nota do aluno: ");
		int nota1 = sc.nextInt();
		System.out.println("Segunda nota do aluno: ");
		int nota2 = sc.nextInt();
		System.out.println("Terceira nota do aluno: ");
		int nota3 = sc.nextInt();

		float media = ((nota1*2)+(nota2*3)+(nota3*5)) /10;

		System.out.println("Media do aluno: "+ media);
		sc.close();
	}

}
