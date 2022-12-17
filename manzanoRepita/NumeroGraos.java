package manzanoRepita;

public class NumeroGraos {

	public static void main(String[] args) {
		int contadora = 1;
		float acumuladora = 0;
		do {
			acumuladora = acumuladora + (acumuladora + 1);
			System.out.printf("%d quadro: %.2f \n", contadora, acumuladora);
			contadora++;
		} while(contadora<=64);

	}

}
