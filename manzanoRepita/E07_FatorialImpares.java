package manzanoRepita;

public class E07_FatorialImpares {

	public static void main(String[]args) {
		
		byte valor = 10;
		byte antecessor = 9;
		int fatorial = valor*antecessor;

		do {
			antecessor--;
			if (antecessor % 2==1) {
				System.out.println("O fatorial da posi��o "+(antecessor+2)+" �: "+fatorial);
				fatorial = fatorial*antecessor;
			}
		} while (antecessor>1);
		
	}
	
}
