package faccat;

import java.util.Scanner;

public class FormarTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		byte num1 = sc.nextByte();
		System.out.println("Segundo valor: ");
		byte num2 = sc.nextByte();
		System.out.println("Terceiro valor: ");
		byte num3 = sc.nextByte();

		if ((num1<num2+num3) && (num2<num1+num3) && (num3<num2+num1)) {
			System.out.println("É possivel formar um triangulo!");
		} else {
			System.out.println("Não é possivel formar um triangulo!");
		}
		sc.close();
	}

}
