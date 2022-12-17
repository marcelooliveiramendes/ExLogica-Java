package manzanoPara;

public class Soma1ao100 {

	public static void main(String[] args) {
		
		int acumuladora = 0;
		for (int contadora = 1; contadora <= 100; contadora++) {
			acumuladora += contadora;
		}
		System.out.println("Total: "+acumuladora);
		
	}

}
