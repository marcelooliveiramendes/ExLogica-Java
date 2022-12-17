package manzanoPara;

public class Potencia3 {

	public static void main(String[] args) {
		
		int potencia = 1;
		for (byte contadora = 0; contadora <= 15; contadora++) {
			potencia = potencia*3;
			if(contadora == 0) potencia = 1;
			System.out.println(3+" ^ "+contadora+" = "+potencia);
		}

	}

}
