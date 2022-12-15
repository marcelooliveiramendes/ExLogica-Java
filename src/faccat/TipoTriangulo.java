package faccat;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro lado: ");
		byte a = sc.nextByte();
		System.out.println("Informe o valor do segundo lado: ");
		byte b = sc.nextByte();
		System.out.println("Informe o valor do terceiro lado: ");
		byte c = sc.nextByte();
		
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
			if ((a == b) && (b == c)) {
				System.out.println("Triangulo Equilatero");
			} else if ((a == b) || (b == c) || (a == c)) {
				System.out.println("Triangulo Isaceles");
			} else {
				System.out.println("Triangulo Escaleno");
			}
		} else {
			System.out.println("Nõo forma um triangulo");
		}
		sc.close();
	}

}
