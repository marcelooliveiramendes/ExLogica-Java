package manzanoPara;

public class SomaDosPares1a500 {

	public static void main(String[] args) {
		
		int acumuladora = 0;
		for (short contadora = 1; contadora <= 500; contadora++) {
			if (contadora % 2 == 0) {
				acumuladora += contadora;
			}
		}
		System.out.println("Total: "+acumuladora);
	}

}
