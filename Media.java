package aula11;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		

	
	double nota1, nota2, nota3, nota4, media;
			
	   Scanner ler = new Scanner(System.in);
			System.out.println("Informe a nota 1: ");
			nota1 = ler.nextDouble();
			System.out.println("Informe a nota 2: ");
			nota2 = ler.nextDouble();
			System.out.println("Informe a nota 3: ");
			nota3 = ler.nextDouble();
			System.out.println("Informe a nota 4: ");
			nota4 = ler.nextDouble();
			ler.close();
			
	media = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.println(media >= 6 ? "Aprovado: " + media : "Reprovado: " + media);
	}

}
