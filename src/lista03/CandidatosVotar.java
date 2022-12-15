package lista03;

import java.util.Scanner;

public class CandidatosVotar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Votos validos para o candidato A: ");
		float validosA = sc.nextFloat();
		System.out.println("Votos nulos para o candidato A: ");
		float nulosA = sc.nextFloat();
		System.out.println("Votos em branco para o candidato A: ");
		float brancosA = sc.nextFloat();
		
		System.out.println("Votos v�lidos para o candidato B: ");
		float validosB = sc.nextFloat();
		System.out.println("Votos nulos para o candidato B: ");
		float nulosB = sc.nextFloat();
		System.out.println("Votos em branco para o candidato B: ");
		float brancosB = sc.nextFloat();
		
		System.out.println("Votos v�lidos para o candidato C: ");
		float validosC = sc.nextFloat();
		System.out.println("Votos nulos para o candidato C: ");
		float nulosC = sc.nextFloat();
		System.out.println("Votos em branco para o candidato C: ");
		float brancosC = sc.nextFloat();
		
		float totalEleitores = (validosA+nulosA+brancosA) + (validosB+nulosB+brancosB) + (validosC+nulosC+brancosC);

		float percValidos = (validosA+validosB+validosC)/totalEleitores*100;
		float percA = validosA/totalEleitores*100;
		float percB = validosB/totalEleitores*100;
		float percC = validosC/totalEleitores*100;
		float nulos = (nulosA+nulosB+nulosC)/totalEleitores*100;
		float brancos = (brancosA+brancosB+brancosC)/totalEleitores*100;
		
		System.out.println("Total de eleitores: "+totalEleitores);
		System.out.println("Votos validos foi de: "+percValidos);
		System.out.println("Votos validos para o candidato A foi de: "+percA);
		System.out.println("Votos validos para o candidato B foi de: "+percB);
		System.out.println("Votos validos para o candidato C foi de: "+percC);
		System.out.println("Votos nulos foi de: "+nulos);
		System.out.println("Votos brancos foi de: "+brancos);
		
		sc.close();
	}
	

}
