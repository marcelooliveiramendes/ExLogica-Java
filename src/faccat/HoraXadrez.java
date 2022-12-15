package faccat;

import java.util.Scanner;

public class HoraXadrez {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio: ");
		int horaInicio = sc.nextInt();
		System.out.println("Digite a hora de termino: ");
		int horaTermino = sc.nextInt();

		int duracao;

		if (horaInicio>horaTermino) {
			duracao = horaTermino-horaInicio+24;
			System.out.println("Duracao: "+duracao);
		} else {
			duracao = horaTermino-horaInicio;
			System.out.println("Duracao: "+duracao);
		}
		sc.close();

	}

}
