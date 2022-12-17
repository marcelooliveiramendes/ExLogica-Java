package lista03;

import java.util.Scanner;

public class Distributiva {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		int valorA = sc.nextInt();
		System.out.println("Segundo valor: ");
		int valorB = sc.nextInt();
		System.out.println("Terceio valor: ");
		int valorC = sc.nextInt();
		System.out.println("Quarto valor: ");
		int valorD = sc.nextInt();
		
		int somaA = valorA+valorB+valorC+valorD;
		int somaB = valorB+valorC+valorD;
		int somaC = valorC+valorD;
		
		int multiA = valorA*valorB*valorC*valorD;
		int multiB = valorB*valorC*valorD;
		int multiC = valorC*valorD;
		
		System.out.println("\nSomas de A: "+somaA);
		System.out.println("Somas de B: "+somaB);
		System.out.println("Somas de C: \n"+somaC);

		System.out.println("Produtos de A: "+multiA);
		System.out.println("Produtos de B: "+multiB);
		System.out.println("Produtos de C: \n"+multiC);
		
		sc.close();
	}

}
