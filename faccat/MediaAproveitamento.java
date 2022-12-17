package faccat;

import java.util.Scanner;

public class MediaAproveitamento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.next();
		
		System.out.println("Digite a primeira nota: ");
		byte nota1 = sc.nextByte();
		System.out.println("Digite a segunda nota: ");
		byte nota2 = sc.nextByte();
		System.out.println("Digite a terceira nota: ");
		byte nota3 = sc.nextByte();
		System.out.println("Digit a media dos exerccios: ");
		byte exercicios = sc.nextByte();
		
		float media = (nota1+ (nota2*2) + (nota3*3) + exercicios)/7;
		
		if (media>=9) {
			System.out.println("Aluno: "+nome);
			System.out.println("Aproveitamento: A");
		} else if (media>=7.5 &&  media < 9) {
			System.out.println("Aluno: "+nome);
			System.out.println("Aproveitamento: B");
		} else if (media >= 6 && media < 7.5)  {
			System.out.println("Aluno: "+nome);
			System.out.println("Aproveitamento: C");
		} else {
			System.out.println("Aluno: "+nome);
			System.out.println("Aproveitamento: D");
		}
		sc.close();
		
	}

}
