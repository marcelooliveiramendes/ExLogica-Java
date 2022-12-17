package manzanoPara;

public class FatorialImpar {

	public static void main(String[] args) {
		
		int antecessor = 9;
		int fatorial = 10;
		
		for (int contadora = 10; contadora >= 1; contadora--) {
			if (antecessor % 2 == 1) {
				System.out.println(fatorial+" x "+antecessor+" = " + (fatorial*antecessor));
				fatorial = fatorial * antecessor;
			}
			antecessor--;
		}

	}

}
