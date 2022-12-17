package manzanoPara;

public class Quadrados15ao200 {

	public static void main(String[] args) {
		
		int quadrado;

		for (int contadora = 15; contadora <= 200; contadora++) {
			quadrado = contadora * contadora;
			System.out.printf("O quadrado de %d é: %d \n", contadora, quadrado);
		}
	}

}
