package manzanoEnquanto;

public class SomaDosPares {

	public static void main(String[] args) {
		
		int i = 1;
		int acumuladora = 0;
		
		while (i <= 500) {	
			if (i % 2 == 0) {
				acumuladora += i;
			}
			i++;
		}
		System.out.println("Total dos pares de 1 ao 500: "+acumuladora);
	}

}
