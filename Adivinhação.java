package aula11;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ler = new Scanner(System.in);
Random random = new Random();

int num = random.nextInt();
int chute;

System.out.println("Escolhi um número. Tente adivinhar:");

while (true) {
	System.out.print("Digite o seu palpite: ");
	chute = ler.nextInt();

	if (chute > num) {
		System.out.println("Errado. O número é menor. ");
	} else if (chute < num) {
		System.out.println("Errado. O número é maior. ");
	} else {
		System.out.println("Acertou! O número era: " + num);
		System.out.println("Parabéns! Você acertou!");
		break;
	}

}
ler.close();
}
}
