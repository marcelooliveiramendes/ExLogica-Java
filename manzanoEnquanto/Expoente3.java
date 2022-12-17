package manzanoEnquanto;

public class Expoente3 {

	public static void main(String[] args) {
		
		int i = 1;
		int calculo = 1;

		System.out.println("3 ^ 0 = 1");
		
		while (i<=15) {
			calculo = calculo * 3;
			System.out.println(3+" ^ "+i+" = "+calculo);
			i++;
		}

	}

}
