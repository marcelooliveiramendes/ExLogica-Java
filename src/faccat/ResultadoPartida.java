package faccat;

import java.util.Scanner;

public class ResultadoPartida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome do primeiro time: ");
		String time1 = sc.next();
		System.out.println("Qual o nome do segundo time: ");
		String time2 = sc.next();
		System.out.println("Quantidade de gols do primeiro time: ");
		byte gols1 = sc.nextByte();
		System.out.println("Quantidade de gols do segundo time: ");
		byte gols2 = sc.nextByte();

		if (gols1>gols2) {
			System.out.println(time1+" é o ganhador!");
		} else if (gols1==gols2) {
			System.out.println("Empate!");
		} else {
			System.out.println(time2+" é o ganhador!");
		}
		sc.close();
	}

}
