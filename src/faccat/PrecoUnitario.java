package faccat;

import java.util.Scanner;

public class PrecoUnitario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String nome = sc.next();
		System.out.println("Digite a quantidade: ");
		byte quantidade = sc.nextByte();
		System.out.println("Digite o preço unitrio: ");
		float preco = sc.nextFloat();
		
		float compra = quantidade * preco;
		
		float total;
		
		if (quantidade <= 5) {
			total = compra - (compra* 2/100);
			System.out.println("Produto: "+nome);
			System.out.println("Valor total: "+total);
		} else if (quantidade > 5 && quantidade <= 10) {
			total = compra-(compra*3/100);
			System.out.println("Produto: "+nome);
			System.out.println("Valor total: "+total);
		} else {
			total = compra-(compra * 5/100);
			System.out.println("Produto: "+nome);
			System.out.println("Valor total: "+total);
		}
		
		sc.close();
		
	}

}
