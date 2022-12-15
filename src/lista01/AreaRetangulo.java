package lista01;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base do retangulo: ");
		int base = sc.nextInt();
		System.out.println("Altura do retangulo");
		int altura = sc.nextInt();

		int area = base*altura;

		System.out.println("Area do retangulo: "+area);

		sc.close();
	}
	
}
