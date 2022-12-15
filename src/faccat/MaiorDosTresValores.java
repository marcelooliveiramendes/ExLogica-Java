package faccat;

import java.util.Scanner;

public class MaiorDosTresValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		byte a = sc.nextByte();
		System.out.println("Digite o segundo valor: ");
		byte b = sc.nextByte();
		System.out.println("Digite o terceiro valor: ");
		byte c = sc.nextByte();
		
		if ((a > b) && (a > c)) {
			System.out.println(a+" é o maior valor!");
		} else if ((b > a) && (b > c)) {
			System.out.println(b+" é o maior valor!");
		} else {
			System.out.println(c+" é o maior valor!");
		}
		sc.close();
	}

}
