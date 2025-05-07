package aula11;

import java.util.Random;
import java.util.Scanner;

public class NumerosMagicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner ler = new Scanner(System.in);
		int acertos = 0;

		System.out.println("Números Mágicos!");
		System.out.println("Tente adivinhar 5 números entre 1 e 50.");

		System.out.println("Digite seus 5 palpites:");
		for (int i = 0; i < 5; i++) {
		System.out.print("Palpite " + (i + 1) + ": ");
		int palpite = ler.nextInt();
		int numeroMagico = random.nextInt(50) + 1;
		System.out.println("O número mágico gerado foi: " + numeroMagico);
		if (palpite == numeroMagico) {
		acertos++;
		}
		}

		System.out.println("\nVocê acertou: " + acertos + " número(s).");

		ler.close();
		}
		

	}


