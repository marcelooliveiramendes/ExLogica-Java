package lista01;

import java.util.Scanner;

public class AreaTrapezio {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base maior do trap�zio: ");
		int baseMaior = sc.nextInt();
		System.out.println("Base menor do trap�zio: ");
		int baseMenor = sc.nextInt();
		System.out.println("Altura do trap�zio: ");
		int altura = sc.nextInt();

		int resultado = (baseMaior+baseMenor) * altura / 2;

		System.out.println("Area do trapazio: " + resultado);
		sc.close();
		
	}
}
