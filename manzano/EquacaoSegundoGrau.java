package manzano;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = sc.nextInt();
		if (a!=0) {
			System.out.println("Informe o valor de B: ");
			int b = sc.nextInt();
			System.out.println("Informe o valor de C: ");
			int c = sc.nextInt();
			int delta = b*b-4*a*c;
			System.out.println("O valor de delta �: "+delta);
			double Rquadrada = Math.pow(delta, 0.5);
			System.out.println("Raiz quadrada de delta: "+Rquadrada);
			if (delta<0 || delta==0) {
				System.out.println("N�o � poss�vel realizar a opera��o...");
			} else {
				double x1 = (b*(-1) + Rquadrada) / (2 * a);
				double x2 = (b*(-1) - Rquadrada) / (2 * a);
				System.out.println("O primeiro valor x �: "+x1);
				System.out.println("O segundo valor x �: "+x2);
			} 
		} else {
			System.out.println("O valor de A tem que ser diferente de 0");
		}
		sc.close();
	}

}
