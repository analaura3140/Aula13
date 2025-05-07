package aula11;

import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
	
Scanner ler = new Scanner(System.in);
int escolha, saldo = 0;
System.out.println("Escolha o que deseja fazer:  \r\n"
		+ "1)Ver saldo \r\n"
		+ "2)Depositar \r\n"
		+ "3)Sacar \r\n"
		+ "4)Sair \r\n");
escolha = ler.nextInt();

 switch (escolha) {
 case 1:
	 System.out.println("Seu saldo é: " + saldo);
	 break;
 case 2:
	 System.out.println("Quanto você deseja depositar: ");
	 break;
 case 3:
	 System.out.println("Quanto você deseja sacar: ");
     break;
 case 4:
	 System.out.println("Obrigado por ter usado nosso sistema!");
	break;
 }
 while (escolha != 4);
 ler.close();
	}

}

