package manzanoRepita;

public class Quadrados15ao200 {

	public static void main(String[] args) {
		
		short contadora = 15;
		
		int numeros;
		
		do {
			numeros = contadora * contadora;
			System.out.printf("Quadrado de %d: %d \n", contadora, numeros);
			contadora++;
		} while (contadora<=200);

	}

}
