package lista01;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		int raio = sc.nextInt();

		float pi = 3.14f;

		float resultado = pi*(raio*raio);
		System.out.println("Area do circulo: "+ resultado);
		sc.close();
	}
	
}
