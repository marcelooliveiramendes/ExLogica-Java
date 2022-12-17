package faccat;

public class TrocarValores {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;

		int auxiliar;
		System.out.println("Valor atual da primeira variavel: " + num1);
		System.out.println("Valor atual da segunda variavel: " + num2);
	
		auxiliar = num1;
		num1 = num2;
		num2 = auxiliar;
		
		System.out.println();
		System.out.println("Valor atualizado da primeira variavel: "+num1);
		System.out.println("Valor atualizado da segunda variavel: "+num2);
	}

}
