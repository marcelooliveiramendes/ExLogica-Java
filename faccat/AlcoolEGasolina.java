package faccat;

import java.util.Scanner;

public class AlcoolEGasolina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Litros vendidos: ");
		byte litros = sc.nextByte();
		System.out.println("Tipo de combustivel");
		char combustivel = sc.next().charAt(0);
		
		float alcool = 2.90f;
		float gasolina = 3.30f;
		float alcoolVendido;
		float gasolinaVendida;
		
		if (combustivel == 'A') {
			if (litros <= 20) {
				alcoolVendido = litros*alcool-((litros*alcool)*3/100);
				System.out.println("Total a pagar: "+alcoolVendido);
			} else {
				alcoolVendido = litros*alcool-((litros*alcool)*5/100);
				System.out.println("Total a pagar: "+alcoolVendido);
			}
		} else {
			if (litros < 20) {
				gasolinaVendida = litros*gasolina-((litros*gasolina)*3/100);
				System.out.println("Total a pagar: "+gasolinaVendida);
			} else {
				gasolinaVendida = litros*gasolina-((litros*gasolina)*5/100);
				System.out.println("Total a pagar: "+gasolinaVendida);
			}
		}
		sc.close();
		
	}

}
