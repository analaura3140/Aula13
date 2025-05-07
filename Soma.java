package aula11;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int numero;
		int soma = 0;

		System.out.println("Digite números positivos para somar (digite um número negativo para parar):");

		do {
		System.out.println("Digite um número:");
		numero = ler.nextInt();

		if (numero > 0) {
		soma = soma + numero;
		}
		} while (numero >= 0);

		System.out.println("A soma dos números positivos digitados é: " + soma);

		ler.close();

		}

		
	}


