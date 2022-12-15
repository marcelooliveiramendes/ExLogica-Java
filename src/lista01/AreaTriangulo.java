package lista01;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base do triangulo: ");
		int base = sc.nextInt();
		System.out.println("Largura do triangulo: ");
		int altura = sc.nextInt();

		int area = (base*altura)/2;

		System.out.println("Area do triangulo: "+ area);
		
		sc.close();
	}
}
