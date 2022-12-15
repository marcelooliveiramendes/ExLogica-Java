package lista01;

import java.util.Scanner;

public class AreaLosango {

	public static void main(String[]args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diagonal maior: ");
		int dMaior = sc.nextInt();
		System.out.println("Diagonal menor: ");
		int dMenor = sc.nextInt();

		int area = (dMaior*dMenor)/2;
		
		System.out.println("Area do losango: "+area);
		sc.close();
	}
}
