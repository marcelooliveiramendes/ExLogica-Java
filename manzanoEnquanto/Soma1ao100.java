package manzanoEnquanto;

public class Soma1ao100 {

	public static void main(String[] args) {
		
		int i = 1;
		int acumuladora = 0;
		
		while (i<=100) {
			acumuladora+=i;
			i++;
		}
		System.out.println("Total: "+acumuladora);
	}

}
