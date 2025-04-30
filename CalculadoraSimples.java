package aula11;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		String simbolo;
		
		System.out.println("Escolha um simbolo: (somar: +), (subtrair: -), (multiplicar: *), (dividir: -): ");
		simbolo = ler.next();
		System.out.println("Escolha um número: ");
		int a = ler.nextInt();
		System.out.println("Escolha um número: ");
		int b = ler.nextInt();
		
		switch (simbolo) {
		case "+" :
			int c = a + b;
		    System.out.println("O resultado é: " + c);
	    	break;
		case "-" :
			int d = a - b;
			System.out.println("O resultado é: " + d);
			break;
		case "*":
			int e = a * b;
			System.out.println("O resultado é: " + e);
			break;
		case "/" :
			int f = a / b;
			System.out.println("O resultado é: " + f);
			break;
			}
		ler.close();
		}
	}


