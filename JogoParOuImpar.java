package aula11;

import java.util.Random;
import java.util.Scanner;

public class JogoParOuImpar {

	public static void main(String[] args) {

Scanner ler = new Scanner(System.in);
Random random = new Random();

int escolha;
int num;
int nume = random.nextInt();
int resultado;

System.out.println("Vamos brincar de par ou ímpar! Escolha entre ser par ou ímpar (Ímpar = 1, par = 2): ");
escolha = ler.nextInt();
System.out.println("Agora digite um número: ");
num = ler.nextInt();

resultado = (nume + num) / 2;

if (resultado == 0) {
	if (escolha == 2) {
		System.out.println("Parabéns você ganhou!");
	}
	else {
		System.out.println("Errado, você perdeu!");
	}
}
else {
	if (escolha == 1) {
		System.out.println("Parabéns você ganhou!");
	} else {
		System.out.println("Errado, você perdeu!");
		ler.close();
	
		
	}
	}
	}
}

