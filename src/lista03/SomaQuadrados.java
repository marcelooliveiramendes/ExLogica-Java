package lista03;

import java.util.Scanner;

public class SomaQuadrados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int num3 = sc.nextInt();
		
		int resultado = (num1*num1)+(num2*num2)+(num3*num3);
		
		System.out.println("Soma dos quadrados: " + resultado);
		sc.close();
	}

}
