package manzanoRepita;

public class SomaPares {

	public static void main(String[] args) {
		
		int contadora = 1;
		int acumuladora = 0;

		do {
			if (contadora%2==0) {
				acumuladora += contadora;
			}
			contadora++;
		} while (contadora<=500);

		System.out.println("A soma de todos os valores pares é de: " + acumuladora);

	}

}
