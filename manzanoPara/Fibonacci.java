package manzanoPara;

public class Fibonacci {

	public static void main(String[] args) {
		int sucessor = 1;
		int antecessor = 0;
		int soma;
		
		System.out.print("0, 1, ");

		for (int i = 0; i <= 15; i++) {
			soma = sucessor + antecessor;
            antecessor = sucessor;
            sucessor = soma;
            System.out.print(soma+", ");
		}

	}

}
